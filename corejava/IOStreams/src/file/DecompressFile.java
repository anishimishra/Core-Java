package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.*;

public class DecompressFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		FileOutputStream fos = null;
		InflaterInputStream iis = null;
		try {
			fis = new FileInputStream("F:\\JAVA\\IOFiles\\zdef.txt");
			iis = new InflaterInputStream(fis);
			fos = new FileOutputStream("F:\\JAVA\\IOFiles\\udef.txt");
			int i;
			while ((i = iis.read()) != -1) {
				fos.write(i);
				fos.flush();
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
				fos.close();
				iis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
