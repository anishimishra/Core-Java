package chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket serverSocket = new ServerSocket(9090);
			System.out.println("server is ready to chat");
			Socket socket = serverSocket.accept();
			DataInputStream in = new DataInputStream(socket.getInputStream());
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String messageReceived = "", messageToSend = "";
			while (true) {
				messageReceived = in.readUTF();
				System.out.println("Client Says " + messageReceived);
				if (messageReceived != null && messageReceived.equals("exit")) {
					break;
				}
				messageToSend = br.readLine();
				out.writeUTF(messageToSend);
				out.flush();
			}
			br.close();
			out.close();
			in.close();
			socket.close();
			serverSocket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
