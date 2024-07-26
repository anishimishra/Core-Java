package encoderdecoder;

import java.util.Base64;

public class URLEncoderDecoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64.Encoder encoder = Base64.getUrlEncoder();
		String k = "http://www.javatpoint.com/java-tutorial/";
		String eStr = encoder.encodeToString(k.getBytes());
		System.out.println(eStr);
		Base64.Decoder decoder = Base64.getUrlDecoder();
		String dStr = new String(decoder.decode(eStr));
		System.out.println(dStr);
	}

}
