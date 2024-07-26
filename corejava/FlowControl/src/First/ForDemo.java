package First;

public class ForDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			if (i == 10) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		// Infinite Loop - its correct
		/*int i=1;
		for(;;) {
			System.out.println(i);
		}*/
		int i=1;
		for(System.out.println("XYZ");i<10;i++) {
			System.out.print(i+" ");
		}
	}

}
