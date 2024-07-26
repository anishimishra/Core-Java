package stringbuffer;

public class SBDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity : " + sb.capacity());

		sb.append("All the power within you.");
		sb.append("You can do anything and everything");

		System.out.println(sb);
		System.out.println("Current capacity : " + sb.capacity());

		System.out.println("Index at 10 : " + sb.charAt(10));

		StringBuffer sb1 = new StringBuffer("abcde");
		System.out.println(sb1.reverse());

		System.out.println(sb1.insert(3, "xyz"));
		System.out.println(sb1.delete(3, 6));
	}

}
