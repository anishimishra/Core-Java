package chat;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ChatClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Socket socket = new Socket("localhost", 9090);
				DataInputStream in = new DataInputStream(socket.getInputStream());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {
			String messageReceived = "", messageToSend = "";

			while (true) {
				messageToSend = br.readLine();
				out.writeUTF(messageToSend);
				out.flush();
				if (messageToSend.equals("exit")) {
					break;
				}
				messageReceived = in.readUTF();
				System.out.println("Server say " + messageReceived);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
