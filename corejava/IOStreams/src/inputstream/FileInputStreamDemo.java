package inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("F:\\JAVA\\IOFiles\\myfile.txt"));
			System.out.println("File opened");

			int i;
			while ((i = fis.read()) != -1) {
				//System.out.print((char)fis.read());
				System.out.print((char) i);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("\nFile closed");
		}
	}
}
