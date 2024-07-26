package file;

import java.io.*;

public class FileCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		file = new File("F:\\JAVA\\IOFiles\\createnewfile.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("New file is created");
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
