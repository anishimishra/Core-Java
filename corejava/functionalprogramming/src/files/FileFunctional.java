package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileFunctional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "F:\\JAVA\\IOFiles\\file.txt";
		try {
			Files.lines(Paths.get(filePath))
			.map(str -> str.split(" "))
			.flatMap(Arrays::stream)
			.distinct()
			.sorted()
					.forEach(System.out::println);
			
			Files.list(Paths.get("."))
			.forEach(i->System.out.print(i+" "));
			
			System.out.println();
			
			Files.list(Paths.get("."))
			.filter(Files::isDirectory)
			.forEach(i->System.out.print(i+" "));
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
