package First;

public class LabelledBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		l1: {
			System.out.println("block begins");
			if (x == 20) {
				break l1;
			}
			System.out.println("block ends");
		}
		System.out.println("outside the block");
	}

}
