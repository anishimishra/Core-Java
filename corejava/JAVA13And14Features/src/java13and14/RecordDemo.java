package java13and14;

public class RecordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee();
		Employee employee = new Employee("john", 10000);
		System.out.println(employee);
		System.out.println(employee.name());
		System.out.println(employee.sal());
		System.out.println(employee.hashCode());
		Employee em = new Employee("bob", 10000);
		System.out.println(em.hashCode());
		Employee e3 = new Employee("john", 10000);
		System.out.println(e3.equals(employee));
		System.out.println(e3.hashCode());
		e.myI();
	}
}