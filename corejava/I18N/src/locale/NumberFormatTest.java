package locale;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 1212332.4343;
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
		nf.setMinimumFractionDigits(4);
		nf.setMaximumFractionDigits(3);
		nf.setMaximumIntegerDigits(10);
		System.out.println(nf.format(d));
		
		long number = 123L;
		NumberFormat nfUS = NumberFormat.getInstance(Locale.US);
		System.out.println(nfUS.format(number));
		NumberFormat nfUK = NumberFormat.getInstance(Locale.UK);
		System.out.println(nfUK.format(number));
	}

}
