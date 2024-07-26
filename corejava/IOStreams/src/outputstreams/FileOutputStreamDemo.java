package outputstreams;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("F:\\JAVA\\IOFiles\\copyit.png");
			fos = new FileOutputStream("F:\\JAVA\\IOFiles\\newimage.png");
			System.out.println("File opened");
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
			System.out.println("File copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
				System.out.println("Files closed");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
