package network;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class MessengerB {
	protected JTextField textField;
	protected JTextArea textArea;
	protected JScrollPane scrollPane;
	
	DatagramSocket socket;
	DatagramPacket packet;
	InetAddress address = null;
	
	final int myPort = 6000;
	final int otherPort = 5000;
	
	public MessengerB () throws IOException {
		new MyFrame();
		address = InetAddress.getByName("127.0.0.1");
		socket = new DatagramSocket(myPort);
	}
	
	public void process() {
		while (true) {
			try {
				byte[] buf = new byte[256];
				packet = new DatagramPacket(buf, buf.length);
				socket.receive(packet);
				textArea.append("RECIEVED: " + new String (buf) +"\n");
			} catch (IOException ioException) {
				ioException.printStackTrace();
			}
		}
	}
	
	class MyFrame extends JFrame implements ActionListener {
		private static final long serialVersionUID = 1L;
		
		public MyFrame() {
			super("MessengerB");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			textField = new JTextField(30);
			textField .addActionListener(this);
			
			textArea = new JTextArea(10,30);
			textArea.setEditable(false);
			scrollPane = new JScrollPane(textArea);
			scrollPane.setVerticalScrollBarPolicy(
					ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			scrollPane.setHorizontalScrollBarPolicy(
					ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
			textArea.setCaretPosition(textArea.getDocument().getLength());
			
			add(textField, BorderLayout.PAGE_END);
			//add(new JScrollPane(textArea), BorderLayout.CENTER);
			
			add(scrollPane, BorderLayout.CENTER);
			pack();
			setVisible(true);
		}
		
		public void actionPerformed(ActionEvent evt) {
			String s = textField.getText();
			byte[] buffer = s.getBytes();
			DatagramPacket packet;
			
			//패킷을 생성한다
			packet = new DatagramPacket(buffer, buffer.length, address, otherPort);
			try {
				socket.send(packet);
			}catch(IOException e) {
				e.printStackTrace();
			}
			textArea.append("SENT : " + s+ "\n");
			textField.selectAll();
		}
	}
	
	public static void main(String []args) throws IOException {
		MessengerB m = new MessengerB();
		m.process();
	}
}
