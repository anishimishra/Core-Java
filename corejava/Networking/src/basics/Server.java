package basics;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(8080);
			System.out.println("wating for the client to connect on port 8080");
			Socket socket = serverSocket.accept();
			System.out.println("connection established");
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String data = dis.readUTF();
			System.out.println("data received " + data);
			dis.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
