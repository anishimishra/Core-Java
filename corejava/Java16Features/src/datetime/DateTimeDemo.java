package datetime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime time = LocalTime.parse("17:30:09.123456");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss B");
		System.out.println(time.format(formatter));
	}

}
