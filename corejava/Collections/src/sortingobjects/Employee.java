package sortingobjects;

public class Employee implements Comparable<Employee> {
	int id;
	String name;

	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int id1 = this.id;
		int id2 = o.id;
		System.out.println(id1 + " " + id2);
		if (id1 < id2) {
			System.out.println(id2 + "id2 is greater");
			return -1;
		} else if (id1 > id2) {
			System.out.println(id1 + "id1 is greater");
			return 1;
		} else {
			return 0;
		}
	}
}
