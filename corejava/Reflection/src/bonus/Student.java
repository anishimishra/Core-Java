package bonus;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

public class Student {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, IllegalArgumentException,
			InvocationTargetException, NoSuchMethodException, SecurityException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		// Class.forName("bonus.Student").newInstance();
		Student s2 = Student.class.getConstructor().newInstance();
		// Student s3 = (Student) s1.clone();
		System.out.println(s1);
		System.out.println(s2);
		// System.out.println(s3);
		DateFormat dateFormat = DateFormat.getInstance();
		System.out.println(dateFormat);
	}

}
