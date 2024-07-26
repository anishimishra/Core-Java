package bytearray;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] buf = { 35, 36, 37, 38 };
		ByteArrayInputStream byt = null;
		byt = new ByteArrayInputStream(buf);
		int k;
		while ((k = byt.read()) != -1) {
			char ch = (char) k;
			System.out.println(ch);
		}
	}

}
