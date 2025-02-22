package immutableclass;

public class MyImmutable {
	int x;

	MyImmutable(int x) {
		this.x = x;
	}

	public MyImmutable change(int x) {
		if (this.x == x) {
			return this;
		} else {
			return new MyImmutable(x);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyImmutable m1 = new MyImmutable(20);
		MyImmutable m2 = m1.change(20);
		System.out.println(m1 == m2);
		MyImmutable m3 = m2.change(30);
		System.out.println(m2 == m3);
	}

}
