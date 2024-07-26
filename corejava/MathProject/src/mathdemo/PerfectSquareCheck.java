package mathdemo;

public class PerfectSquareCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 729;
		int s = (int) Math.sqrt(n);
		if (s * s == n) {
			System.out.println(n + " is a Perfect Square");
		} else {
			System.out.println(n + " is not a Perfect Square");
		}
	}

}
