package encoderdecoder;

import java.util.Base64;

public class EncoderDecoderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base64.Encoder encoder = Base64.getEncoder();
		byte[] arr = { 1, 2 };
		byte[] arr2 = encoder.encode(arr);
		System.out.println(arr2);
		byte[] arr3 = new byte[5];
		int x = encoder.encode(arr, arr3);
		System.out.println(arr3);
		System.out.println(x);
		String k = "Anishi";
		String str = encoder.encodeToString(k.getBytes());
		System.out.println(str);
		Base64.Decoder decoder = Base64.getDecoder();
		String dStr = new String(decoder.decode(str));
		System.out.println(dStr);
	}

}
