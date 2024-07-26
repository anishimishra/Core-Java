package bytearray;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		FileOutputStream fos2 = null;
		ByteArrayOutputStream baos = null;
		try {
			fos = new FileOutputStream("F:\\JAVA\\IOFiles\\a.txt");
			fos2 = new FileOutputStream("F:\\JAVA\\IOFiles\\b.txt");
			baos = new ByteArrayOutputStream();
			baos.write(65);
			baos.writeTo(fos);
			baos.writeTo(fos2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				baos.flush();
				baos.close();
				System.out.println("Success");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
