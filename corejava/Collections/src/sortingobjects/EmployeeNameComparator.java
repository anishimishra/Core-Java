package sortingobjects;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		/*if (o1.name.charAt(0) > o2.name.charAt(0)) {
			return 1;
		} else if (o2.name.charAt(0) > o1.name.charAt(0)) {
			return -1;
		} else {
			return 0;
		}*/
		return o1.name.compareTo(o2.name);
	}

}
