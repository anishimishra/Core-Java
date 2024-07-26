package bufferedreader;

import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class BufferedReadrerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("F:\\JAVA\\IOFiles\\myfile.txt");
			br = new BufferedReader(fr);
			String line;
			int count = 0, count1 = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				StringTokenizer st = new StringTokenizer(line);
				count++;
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count1++;
				}
			}
			System.out.println("Number of lines: " + count);
			System.out.println("Number of words: " + count1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
