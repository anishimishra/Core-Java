package encoderdecoder;

import java.util.Base64;

public class MIMEEncoderDecoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64.Encoder encoder = Base64.getMimeEncoder();
		String message = "Hello, \nYou are informed regarding your inconsistency of work";
		String eStr = encoder.encodeToString(message.getBytes());
		System.out.println(eStr);
		Base64.Decoder decoder = Base64.getMimeDecoder();
		String dStr = new String(decoder.decode(eStr));
		System.out.println(dStr);
	}

}
