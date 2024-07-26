package locale;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		DateFormat usDF = DateFormat.getDateInstance(0, Locale.US);
		DateFormat ukDF = DateFormat.getDateInstance(0, Locale.UK);
		System.out.println("Date in US Format: " + usDF.format(d));
		System.out.println("Date in UK Format: " + ukDF.format(d));

		DateFormat timeInstance = DateFormat.getTimeInstance();
		DateFormat timeInstance2 = DateFormat.getTimeInstance(0);
		System.out.println(timeInstance.format(d));
		System.out.println(timeInstance2.format(d));

		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
		System.out.println(dateTimeInstance.format(d));
	}

}
