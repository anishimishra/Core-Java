package file;

import java.io.*;

public class FileExists {
	public static void main(String[] args) {
		String path = "";
		boolean bool = false;
		File file = null;
		File file2 = null;
		file = new File("F:\\JAVA\\IOFiles\\testing.txt");
		try {
			file.createNewFile();
			System.out.println(file);
			file2 = file.getCanonicalFile();
			System.out.println(file2);
			bool = file2.exists();
			path = file2.getAbsolutePath();
			System.out.println(bool);
			if (bool) {
				System.out.println(path + " Exists? " + bool);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
