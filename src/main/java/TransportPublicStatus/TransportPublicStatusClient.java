package TransportPublicStatus;


import TransportPublicStatus.TransportPublicStatusGrpc.TransportPublicStatusStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.awt.Dimension;
import java.awt.Insets;
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

import RouteSelection.RouteSelectionClient;


public class TransportPublicStatusClient implements ActionListener {

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
	    
	    TransportPublicStatusClient gui = new TransportPublicStatusClient();

		gui.build();	
	    } 
}
	private JTextField entry1, reply1;
	private JTextField entry2, reply2;
	
	private JPanel getService1JPanel() {

		JPanel panel = new JPanel();

		BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.X_AXIS);

		JLabel label = new JLabel("Enter the transport method")	;
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

		JLabel label = new JLabel("Enter the transport method")	;
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
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		String label = button.getActionCommand();  

		if (label.equals("Invoke Service 1")) {
			System.out.println("service 1 to be invoked ...");

		
			/*
			 * 
			 */
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
				} catch (InterruptedException t) {
					// TODO Auto-generated catch block
					t.printStackTrace();
				}
		    	requestObserver.onNext(rm);
		    	
		    	try {
					Thread.sleep(1500);
				} catch (InterruptedException t) {
					// TODO Auto-generated catch block
					t.printStackTrace();
				}
		    	requestObserver.onNext(rm1);

		    channel.shutdownNow();
		
		
		}else if (label.equals("Invoke Service 2")) {
			System.out.println("service 2 to be invoked ...");

		
			/*
			 * 
			 */
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
				} catch (InterruptedException t) {
					// TODO Auto-generated catch block
					t.printStackTrace();
				}
		    	requestObserver1.onNext(srm);
		    	//requestObserver1.onCompleted();
		    	
		    }
		
		    requestObserver1.onCompleted();
		    
		    while (true) {
		    	try {
					Thread.sleep(2000);
				} catch (InterruptedException t) {
					// TODO Auto-generated catch block
					t.printStackTrace();
				}
		    }
			
		}
	}
	

}

