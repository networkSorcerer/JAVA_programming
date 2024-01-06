package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Reciver {
	public static void main(String []args) throws IOException {
		byte [] buf = new byte[256];
		
		DatagramSocket socket = new DatagramSocket(5000);
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		System.out.println("데이터 전송을 기다리고 있습니다 \n");
		
		socket.receive(packet);
		
		System.out.println("[전송 데이터]");
		System.out.println(new String(buf, 0, packet.getLength()));
		socket.close();
	}
}
