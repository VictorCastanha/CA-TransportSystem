package RouteSelection;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import RouteSelection.RouteSelectionGrpc.RouteSelectionBlockingStub;
import RouteSelection.RouteSelectionGrpc.RouteSelectionStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class RouteSelectionClient {

	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	
		//Build a channel
			
				int port = 50052;
				String host = "localhost";
			
				//Client streaming side
				ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
				// Create a stub, pass the channel to the stub
				// The stub is specific to our service
				
				RouteSelectionStub stub = RouteSelectionGrpc.newStub(newChannel);
				
				StreamObserver<routeSelected> responseObserver = new StreamObserver<routeSelected>() {
					@Override
					public void onNext(routeSelected rm) {
						System.out.println(rm.getDestination());												
					}
			        @Override
			        public void onCompleted() {		            
			        }
					@Override
					public void onError(Throwable t) {
						// TODO Auto-generated method stub
					}				
				};				
				StreamObserver<route> requestObserver = stub.selectRoute(responseObserver);
			    
			    	route rm = route.newBuilder().setStringAddress("Selected route 1 ").build();
			    	route rm1 = route.newBuilder().setStringAddress("Selected route 2 ").build();
			    
			    	try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	requestObserver.onNext(rm);
			    	
			    	try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			    	requestObserver.onNext(rm1);

			    newChannel.shutdownNow();
			    
	//Server streaming side
			   
			    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
			    RouteSelectionBlockingStub blockingStub = RouteSelectionGrpc.newBlockingStub(channel);
				
			    requestTransport request = requestTransport.newBuilder().setReqTransport("The route seleted has bus and train available").build();

				Iterator<transportAvailable> responses = blockingStub.transportPublicAvailable(request);

				while (responses.hasNext()) {
					transportAvailable srm = responses.next();
					System.out.println(srm.getKindTransport());
				}
				channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
						

	}
}
