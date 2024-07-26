package datastream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream file = null;
		DataOutputStream data = null;
		try {
			file = new FileOutputStream("F:\\JAVA\\IOFiles\\k.txt");
			data = new DataOutputStream(file);
			data.writeInt(66);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				data.close();
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
