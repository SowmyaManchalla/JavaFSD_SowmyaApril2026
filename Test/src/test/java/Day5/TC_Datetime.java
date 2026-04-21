package Day5;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.time.format.FormatStyle;

public class TC_Datetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/YYYY");
		
		
		Instant currenttime = Instant.now();
		System.out.println("current time:"+currenttime);
		
		LocalDate now = LocalDate.now();
		System.out.println("Localdate:"+now.plusDays(1));
		
		System.out.println("is leap?:"+now.isLeapYear());
		System.out.println("Localdate add month:"+now.plusMonths(1));
		
		LocalDate independence = LocalDate.of(1947,Month.AUGUST, 15);
		System.out.println("Independence:"+independence);
		
		ZonedDateTime ct = ZonedDateTime.now();
		ZonedDateTime ctparis = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		
		System.out.println("machine time:"+ct);
		System.out.println("Paris time:"+ctparis);
		
		Period period = now.until(independence);
		
		System.out.println("period:"+period);

	}

}
