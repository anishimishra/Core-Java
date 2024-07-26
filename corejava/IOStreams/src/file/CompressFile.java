package file;

import java.io.*;
import java.util.zip.*;

public class CompressFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		DeflaterOutputStream dos = null;
		try {
			fis = new FileInputStream("F:\\JAVA\\IOFiles\\myfile.txt");
			fos = new FileOutputStream("F:\\JAVA\\IOFiles\\zdef.txt");
			dos = new DeflaterOutputStream(fos);
			int i;
			while ((i = fis.read()) != -1) {
				dos.write(i);
				dos.flush();
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
				dos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
