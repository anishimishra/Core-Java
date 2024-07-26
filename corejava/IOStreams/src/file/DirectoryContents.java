package file;

import java.io.File;

public class DirectoryContents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("F:\\JAVA\\IOFiles");
		String filenames[] = f.list();
		for (String filename : filenames) {
			System.out.println(filename);
		}
	}

}
