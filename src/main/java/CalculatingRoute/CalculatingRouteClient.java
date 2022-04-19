package CalculatingRoute;

import java.util.concurrent.TimeUnit;

import CalculatingRoute.CalculatingRouteGrpc.CalculatingRouteBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatingRouteClient {

	public static void main(String[] args) throws InterruptedException {
		
		//Build a channel - a channel connects the client to the server 
		int port = 50051;
		String host = "localhost";
		
		ManagedChannel newChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		//code above is completely generic
		
		//now build our message
		//Note that contains string is in the same package so we dont need to do an import
		requestAddress  cString = requestAddress.newBuilder().setStringAddress("55 Mountjoy Square").setZIPCode("D01 TH63").build();
		
		//Create a stub, pass the channel to the stub
		//the stub is specific to the service 
		//the stub is a local representation of our remote object
		
		CalculatingRouteBlockingStub bstub = CalculatingRouteGrpc.newBlockingStub(newChannel);
	
		//Now we can actually call the service and get a response back
		//The service has methods (rpcs) which we can call 
	
		lookingAddress response = bstub.writeAddress(cString);
		System.out.println(response.getLookingAddress());
		
		//lets call the other rpc that we have on the service
		
		addressDistance distanceMsg = bstub.displayDistance(cString);
		System.out.println("The distance between your location to the address: " + cString + " is: " + distanceMsg.getDestinationKm() + "km to the destination");
		
		//Clean up: shutdown the channel
		newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
		
	}
		// TODO Auto-generated method stub

	}


