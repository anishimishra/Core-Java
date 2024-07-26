package inetdemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetResolverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			InetAddress name = InetAddress.getByName("google.com");
			System.out.println(name.getHostAddress());
			System.out.println(name);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
