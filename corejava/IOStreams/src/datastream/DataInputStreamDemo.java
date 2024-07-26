package datastream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = null;
		DataInputStream dis = null;
		try {
			is = new FileInputStream("F:\\JAVA\\IOFiles\\myfile.txt");
			dis = new DataInputStream(is);
			int count = is.available();
			byte[] ary = new byte[count];
			is.read(ary);
			for (byte b : ary) {
				char k = (char) b;
				System.out.print(k + " ");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
