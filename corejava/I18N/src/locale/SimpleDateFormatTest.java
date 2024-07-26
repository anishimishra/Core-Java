package locale;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
		String date = sdf.format(new Date());
		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/dd/yyyy");
		String date2 = sdf2.format(new Date());
		System.out.println(date2);

		String dateAsString = "10-12-2014";
		SimpleDateFormat sd = new SimpleDateFormat("dd-M-yyyy");
		Date datef = sd.parse(dateAsString);
		System.out.println(datef);
	}

}
