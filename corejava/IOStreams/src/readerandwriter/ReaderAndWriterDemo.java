package readerandwriter;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = null;
		FileWriter fw = null;
		fr = new FileReader("F:\\JAVA\\IOFiles\\myfile.txt");
		fw = new FileWriter("F:\\JAVA\\IOFiles\\newfile.txt");
		int ch;
		while ((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
	}

}
