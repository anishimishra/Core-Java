package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "you are the creater of your own destiny";
		String sr = "you,are,the,creater,of,your,own,destiny";
		StringTokenizer st = new StringTokenizer(s);
		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + ";");
		}
		System.out.println();
		StringTokenizer srt = new StringTokenizer(sr, ",", true);
		while (srt.hasMoreTokens()) {
			System.out.print(srt.nextToken() + ":");
		}
	}

}
