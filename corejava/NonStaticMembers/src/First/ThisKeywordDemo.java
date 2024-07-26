package First;

public class ThisKeywordDemo {
	int x;

	ThisKeywordDemo() {
		System.out.println(this);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThisKeywordDemo();
		new ThisKeywordDemo();
	}

}
