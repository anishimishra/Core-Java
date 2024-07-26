package file;

import java.io.File;

public class DirectoryContentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = new File("F:\\JAVA\\IOFiles");
		File files[] = dir.listFiles();
		for (File file : files) {
			System.out.println(file.getName() + " Can write: " + file.canWrite() + " Is Hidden " + file.isHidden()
					+ " Length: " + file.length() + " bytes.");
		}
	}

}
