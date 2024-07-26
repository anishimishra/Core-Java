package serializationdeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("F:\\JAVA\\IOFiles\\Emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Employee emp = (Employee) obj;
			System.out.println(emp.id + " " + emp.name + " " + emp.salary + " " + emp.ssn);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
