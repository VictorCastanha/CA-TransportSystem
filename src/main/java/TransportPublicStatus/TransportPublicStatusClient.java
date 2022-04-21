package TransportPublicStatus;


import TransportPublicStatus.TransportPublicStatusGrpc.TransportPublicStatusStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class TransportPublicStatusClient {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		//Build a channel
		
		int port = 50053;
		String host = "localhost";
		
		//Rpc Method 1 Client streaming side
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		// Create a stub, pass the channel to the stub
		// The stub is specific to our service
		
		TransportPublicStatusStub stub = TransportPublicStatusGrpc.newStub(channel);
		
		StreamObserver<transpSelected> responseObserver = new StreamObserver<transpSelected>() {
			@Override
			public void onNext(transpSelected rm) {
				System.out.println(rm.getTransportInformations());												
			}
	        @Override
	        public void onCompleted() {		            
	        }
			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
			}				
		};				
		StreamObserver<transpSelection> requestObserver = stub.selectTransportPublic(responseObserver);
	    
			transpSelection rm = transpSelection.newBuilder().setTransportOption("Selected route 1 ").build();
	    	transpSelection rm1 = transpSelection.newBuilder().setTransportOption("Selected route 2 ").build();
	    
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

	    channel.shutdownNow();
	
	
	//RPC method 2 Bidirectional

		ManagedChannel newChannel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
		TransportPublicStatusStub stub1 = TransportPublicStatusGrpc.newStub(newChannel);
		
		
		StreamObserver<transResponse> responseObserver1 = new StreamObserver<transResponse>() {
	       
			@Override
	        public void onNext(transResponse rm) {
	            System.out.println(rm.getStringTransResponse());
	        }
	
	        @Override
	        public void onCompleted() {
	        }
	
			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		StreamObserver<transpStatus> requestObserver1 = stub1.statusTransportPublic(responseObserver1);
	    
	    
	    for (int i = 0; i < 2; i++) {
	    	transpStatus srm = transpStatus.newBuilder().setTransportSituation("Client message " + i).build();
	    	try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	requestObserver1.onNext(srm);
	    	//requestObserver1.onCompleted();
	    	
	    }
	
	    requestObserver1.onCompleted();
	    
	    while (true) {
	    	try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	   // newChannel.shutdownNow();
			
}
}

