package com.stream.day2;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;


public class DateTimePract {

	public static void main(String[] args) {
		
		Instant i= Instant.now(); //nano secs is precision
		Instant i1= Instant.now();
		

	System.out.println(Duration.between(i, i1)); // seconds between instant
	
	LocalDate ld = LocalDate.now(); // precision in days		
	LocalDate ld1 = LocalDate.now();
	
	System.out.println(Period.between(ld, ld1)); //Days between two dates
	System.out.println(ld.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))); // Gets next sunday
	
	System.out.println(ld.with(TemporalAdjusters.previous(DayOfWeek.SUNDAY)));  // Gets Previous Sunday
	
	System.out.println(LocalDateTime.now()); // Gives date and Time
	
	System.out.println(ZonedDateTime.now());
	
	System.out.println(LocalDateTime.now().toLocalDate()); // LDT can be converted to LocalDate
	
	Date d = new Date();
	System.out.println(d.toInstant()); // date converetd to instant and instant can be converted to date using from method
	
	System.out.println(LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME)); //Converts datetime to String Format provided
	
	}

}
