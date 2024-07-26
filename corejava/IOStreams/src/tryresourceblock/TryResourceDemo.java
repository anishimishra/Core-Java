package tryresourceblock;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TryResourceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileReader fr = new FileReader("F:\\JAVA\\IOFiles\\myfile.txt");
				BufferedReader br = new BufferedReader(fr);) {
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
		}
	}

}
