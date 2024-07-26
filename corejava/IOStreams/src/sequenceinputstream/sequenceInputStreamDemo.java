package sequenceinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class sequenceInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream input1 = null;
		FileInputStream input2 = null;
		FileOutputStream output = null;
		SequenceInputStream inst = null;
		try {
			input1 = new FileInputStream("F:\\JAVA\\IOFiles\\one.txt");
			input2 = new FileInputStream("F:\\JAVA\\IOFiles\\two.txt");
			output = new FileOutputStream("F:\\JAVA\\IOFiles\\onetwo.txt");
			inst = new SequenceInputStream(input1, input2);
			int i;
			while ((i = inst.read()) != -1) {
				output.write(i);
				System.out.print((char) i + "");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				inst.close();
				input1.close();
				input2.close();
				output.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
