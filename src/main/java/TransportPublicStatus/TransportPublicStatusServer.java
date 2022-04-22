package TransportPublicStatus;

import java.io.IOException;
import TransportPublicStatus.TransportPublicStatusGrpc.TransportPublicStatusImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TransportPublicStatusServer extends TransportPublicStatusImplBase {

	static String bouncingString = "";

	public static void main(String[] args)  throws IOException, InterruptedException {
		TransportPublicStatusServer service1 = new TransportPublicStatusServer();

		int port = 50053;

		Server server = ServerBuilder.forPort(port)
				.addService(service1)
				.build()
				.start();

		System.out.println("Service started, listening on " + port);

		server.awaitTermination();

	}
	
	//RPC Method 1 - Client
	@Override
	public StreamObserver<transpSelection>selectTransportPublic(StreamObserver<transpSelected>responseObserver){
		System.out.println("Selection of the public Transport and see its status");
		return new StreamObserver<transpSelection>() {
			int count;
			
	        @Override
	        public void onNext(transpSelection value) {
	            count++;
	            System.out.println("Item " + count + " - " + value.getTransportOption()); 
	        }	
	        
			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub					
			}		        
	        
	        @Override
	        public void onCompleted() {
	        
	        	responseObserver.onNext(transpSelected.newBuilder()
	        		.setTransportInformations("Looking for the information about this transport public")
	        		.build());
	        	responseObserver.onCompleted();	
	        }						
		};					
	}
	
	
	//RPC Method 2 - Bidirectional
	@Override
	public StreamObserver<transpStatus> statusTransportPublic(StreamObserver<transResponse> responseObserver) {
		return new StreamObserver<transpStatus>() {
	        int count;
	        
	        @Override
	        public void onNext(transpStatus rq) {
	            count++;
	            System.out.println(rq.getTransportSituation());
	            for (int i = 1; i < 3; i++) {
	            	transResponse rm = transResponse.newBuilder().setStringTransResponse("The transport selected " + i + " is not to busy.... and there are seats available." ).build();
	            	try {
	    				Thread.sleep(1500);
	    			} catch (InterruptedException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    	    	responseObserver.onNext(rm);
	    	    	
	    	    	
	    	    }	
	           /* for (int i = 1; i < 2; i++) {
	            	transResponse rm = transResponse.newBuilder().setStringTransResponse("... and there are seats available." ).build();
	            	try {
	    				Thread.sleep(1500);
	    			} catch (InterruptedException e) {
	    				// TODO Auto-generated catch block
	    				e.printStackTrace();
	    			}
	    	    	responseObserver.onNext(rm);
	    	    }*/
	        }
	        @Override
	        public void onCompleted() {
	            responseObserver.onCompleted();
	        }

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

	    };
		
	}	
	

}
