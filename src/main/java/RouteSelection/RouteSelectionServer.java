package RouteSelection;

import java.io.IOException;

import RouteSelection.RouteSelectionGrpc.RouteSelectionImplBase;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class RouteSelectionServer {

	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		RouteSelectionServer routeServer = new RouteSelectionServer();
		routeServer.start();		
	}

	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50052;
		
		server = ServerBuilder.forPort(port).addService((BindableService) new RouteSelectionServerImpl()).build().start();
		System.out.println("Server running on port: " + port );
		
		server.awaitTermination();

	}

	static class RouteSelectionServerImpl extends RouteSelectionImplBase{
		
		//Client Streaming
		@Override
		public StreamObserver<route>selectRoute(StreamObserver<routeSelected>responseObserver){
			System.out.println("Selection of the route");
			return new StreamObserver<route>() {
				int count;
				
		        @Override
		        public void onNext(route value) {
		            count++;
		            System.out.println("Item " + count + " - " + value.getStringAddress()); 
		        }	
		        
				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub					
				}		        
		        
		        @Override
		        public void onCompleted() {
		        
		        	responseObserver.onNext(routeSelected.newBuilder()
		        		.setDestination("Message from server, streaming now completed")
		        		.build());
		        	responseObserver.onCompleted();	
		        }						
			};					
		}
		
		//Server Streaming Side
		@Override
		public void transportPublicAvailable(requestTransport request, StreamObserver<transportAvailable> responseObserver) {
			//Find out what was the content of the message sent by the client
			String reqTransport = request.getReqTransport();
			System.out.println("Our first String is: " + reqTransport);
			
			//Now build up our response
			transportAvailable.Builder responseBuilder = transportAvailable.newBuilder();
			
			//First message
			responseBuilder.setKindTransport("Our First Response String is:  " + reqTransport);
			
			responseObserver.onNext(responseBuilder.build());
			
			//later messages
			responseObserver.onNext(responseBuilder.build());
		//	responseObserver.onNext(responseBuilder.build());
		//	responseObserver.onNext(responseBuilder.build());

			responseObserver.onCompleted();
			
		}
	
	}
}


