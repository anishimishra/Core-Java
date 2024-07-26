package checked;

import java.io.*;

public class CheckedException {
	void readFile() throws FileNotFoundException {

		FileInputStream fis = new FileInputStream("");

	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		CheckedException ce = new CheckedException();
		ce.readFile();
	}

}
