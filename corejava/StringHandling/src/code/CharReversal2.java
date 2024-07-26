package code;

public class CharReversal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is awesome!!";
		String[] temp = s.split(" ");
		int i = 0;
		String result = "";
		while (i < temp.length) {
			result += new StringBuffer(temp[i]).reverse().toString();
			i++;
			if (i != temp.length) {
				result += " ";
			}
		}
		System.out.println(result);
	}

}
