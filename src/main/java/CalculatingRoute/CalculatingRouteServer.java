package CalculatingRoute;

import java.io.IOException;

import CalculatingRoute.CalculatingRouteGrpc.CalculatingRouteImplBase;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class CalculatingRouteServer{
	
	private Server server;
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		CalculatingRouteServer ourServer = new CalculatingRouteServer();
		ourServer.start();		
	}

	private void start() throws IOException, InterruptedException {
		System.out.println("Starting gRPC Server");
		int port = 50051;
		
		server = ServerBuilder.forPort(port).addService((BindableService) new CalculatingRouteServerImpl()).build().start();
		System.out.println("Server running on port: " + port );
		
		server.awaitTermination();

	}
	
	static class CalculatingRouteServerImpl extends CalculatingRouteImplBase{
		
		@Override
		public void writeAddress(requestAddress request, StreamObserver<lookingAddress> responseObserver) {
			//Find out what was the content of the message sent by the client
			String firstString = request.getStringAddress();
			String secondString = request.getZIPCode();
			System.out.println("The address is: " + firstString + "and the ZIP Code is: " + secondString);
			
			//Now build up our response
			
			lookingAddress answer = lookingAddress.newBuilder().setLookingAddress("The route is being calculate").build();
			
			responseObserver.onNext(answer);
			responseObserver.onCompleted();
			
		}	

		@Override
		public void displayDistance(requestAddress request, StreamObserver<addressDistance> responseObserver) {
			//Find out what was the content of the message sent by the client
			//String firstString = request.getStringAddress();
			//String secondString = request.getZIPCode();
			//System.out.println("The address is: " + firstString + "and the ZIP Code is: " + secondString);
			
			//Now build up our response
			
			addressDistance answer = addressDistance.newBuilder().setDestinationKm(150).build();
			
			responseObserver.onNext(answer);
			responseObserver.onCompleted();
			
		}
	
	}
	

}
