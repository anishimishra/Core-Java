package regexfile;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextFileFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("F:\\JAVA\\IOFiles");
		String[] fileNames = directory.list();
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[.]txt");
		int count = 0;
		for (String fileName : fileNames) {
			Matcher matcher = pattern.matcher(fileName);
			if (matcher.matches()) {
				System.out.println(fileName);
				count++;
			}
		}
		System.out.println(count);
	}

}
