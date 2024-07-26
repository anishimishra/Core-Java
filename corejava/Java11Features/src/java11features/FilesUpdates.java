package java11features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesUpdates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Path path = Files
					.writeString(Files
							.createTempFile("test", ".txt"), 
							"Java 11 is cool");
			System.out.println(path);
			String str = Files.readString(path);
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
