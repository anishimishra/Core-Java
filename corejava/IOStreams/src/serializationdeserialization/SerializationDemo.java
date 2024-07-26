package serializationdeserialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("F:\\JAVA\\IOFiles\\Emp.ser");
			oos = new ObjectOutputStream(fos);
			Employee emp = new Employee(1, "John", 10000, 12345);
			oos.writeObject(emp);
			System.out.println("Employee object serialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
