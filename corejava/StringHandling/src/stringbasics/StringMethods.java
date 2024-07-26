package stringbasics;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
		System.out.println("Length of s is : " + s.length());
		System.out.println("Index f o in s is : " + s.indexOf('o'));
		System.out.println("character at index 3: " + s.charAt(3));
		System.out.println("substring with beginning index 2: " + s.substring(2));
		System.out.println("substring with beginning index 0 and end index 4: " + s.substring(0, 4));

		String st = "Hello World";
		String[] split = st.split(" ");
		System.out.println(split);
		for (String string : split) {
			System.out.println(string);
		}

		System.out.println("Replace l from k: " + st.replace('l', 'k'));
		System.out.println("toUpperCase : " + st.toUpperCase());
		System.out.println("toLowerCase : " + st.toLowerCase());
	}
}
