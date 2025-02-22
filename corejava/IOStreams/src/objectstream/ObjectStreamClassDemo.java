package objectstream;

import java.io.ObjectStreamClass;
import java.util.Calendar;

public class ObjectStreamClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create a new object stream class for Integers
		ObjectStreamClass osc = ObjectStreamClass.lookup(String.class);

		// get the value field from ObjectStreamClass for integers
		System.out.println("" + osc.getField("hashCode"));

		// create a new object stream class for Calendar
		ObjectStreamClass osc2 = ObjectStreamClass.lookup(Calendar.class);

		// get the Class instance for osc2
		System.out.println("" + osc2.getField("isTimeSet"));
	}

}
