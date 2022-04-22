package CalculatingRoute;


import java.util.concurrent.TimeUnit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import CalculatingRoute.CalculatingRouteGrpc.CalculatingRouteBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatingRouteClient implements ActionListener {

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
		
		CalculatingRouteClient gui = new CalculatingRouteClient();

		gui.build();
	}
	//GUI 
	
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;

	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter destination")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry1 = new JTextField("",10);
		panel.add(entry1);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Call Service 1");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply1 = new JTextField("", 10);
		reply1 .setEditable(false);
		panel.add(reply1 );

		panel.setLayout(boxlayout);

		return panel;

	}

	private JPanel getService2JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter ZIP CODE")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Call Service 2");
		button.addActionListener(this);
		panel.add(button);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		reply2 = new JTextField("", 10);
		reply2 .setEditable(false);
		panel.add(reply2 );

		panel.setLayout(boxlayout);

		return panel;
	}
	
	private void build() { 

		JFrame frame = new JFrame("Calcute of the Route");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Set the panel to add buttons
		JPanel panel = new JPanel();

		// Set the BoxLayout to be X_AXIS: from left to right
		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

		panel.setLayout(boxlayout);

		// Set border for the panel
		panel.setBorder(new EmptyBorder(new Insets(50, 100, 50, 100)));
	
		panel.add( getService1JPanel() ); //add method 
		panel.add( getService2JPanel() );
	

		// Set size for the frame
		frame.setSize(300, 300);

		// Set the window to be visible as the default to be false
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Invoke Service 1")) {
			System.out.println("service 1 to be invoked ...");
//daqui service 1
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
			try {
				newChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	

		
	}
	
	}
}	


