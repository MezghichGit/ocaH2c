package chapter3.LesCollections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainDateTime {

	public static void main(String[] args) {
		//LocalDate ld = LocalDate.now();
		/*LocalDate ld = LocalDate.of(2020, Month.APRIL, 12);
		LocalTime lt = LocalTime.now();
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt);*/
		
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		
		System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
		System.out.println(date);
		//DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter fs = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(date.format(fs));
		System.out.println(fs.format(date));

	}

}
