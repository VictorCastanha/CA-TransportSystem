package RouteSelection;

import java.awt.Dimension;
import java.awt.Insets;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import RouteSelection.RouteSelectionGrpc.RouteSelectionBlockingStub;
import RouteSelection.RouteSelectionGrpc.RouteSelectionStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


public class RouteSelectionClient implements ActionListener {

	
	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
	
		//Build a channel
			
				int port = 50051;
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
			
				RouteSelectionClient gui = new RouteSelectionClient();

				gui.build();

	}
	//GUI 
	
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	
	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter address")	;
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

		JLabel label = new JLabel("Enter route")	;
		panel.add(label);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));
		entry2 = new JTextField("",10);
		panel.add(entry2);
		panel.add(Box.createRigidArea(new Dimension(10, 0)));

		JButton button = new JButton("Call Transp Public Available");
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

		JFrame frame = new JFrame("Selection of Route");
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
				} catch (InterruptedException g) {
					// TODO Auto-generated catch block
					g.printStackTrace();
				}
		    	requestObserver.onNext(rm);
		    	
		    	try {
					Thread.sleep(1500);
				} catch (InterruptedException g) {
					// TODO Auto-generated catch block
					g.printStackTrace();
				}
		    	requestObserver.onNext(rm1);

		    newChannel.shutdownNow();	
			/*
			 * 
			 */
			
		
		}else if (label.equals("Invoke Service 2")) {
			System.out.println("service 2 to be invoked ...");

		    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		    RouteSelectionBlockingStub blockingStub = RouteSelectionGrpc.newBlockingStub(channel);
			
		    requestTransport request = requestTransport.newBuilder().setReqTransport("The route seleted has bus and train available").build();

			Iterator<transportAvailable> responses = blockingStub.transportPublicAvailable(request);

			while (responses.hasNext()) {
				transportAvailable srm = responses.next();
				System.out.println(srm.getKindTransport());
			}
			try {
				channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			/*
			 * 
			 */

			
		}
	}

}
