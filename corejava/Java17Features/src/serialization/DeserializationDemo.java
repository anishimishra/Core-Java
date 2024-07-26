package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputFilter;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("F:\\JAVA\\IOFiles\\Emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ObjectInputFilter filter1 = ObjectInputFilter.Config
					.createFilter("serializationdeserialization.Employee;java.base/*;!*");
			// ois.setObjectInputFilter(filter1);

			ObjectInputFilter filter2 = ObjectInputFilter.allowFilter(cl -> cl.equals(Employee.class),
					ObjectInputFilter.Status.REJECTED);
			ObjectInputFilter filter3 = ObjectInputFilter.allowFilter(cl -> cl.equals(String.class),
					ObjectInputFilter.Status.REJECTED);

			// ois.setObjectInputFilter(filter3);
			ObjectInputFilter mergedFilter = ObjectInputFilter.merge(filter1, filter2);
			ois.setObjectInputFilter(mergedFilter);
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
