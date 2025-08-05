package pack;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class prg12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LocalDate birthDate = LocalDate.of(2003, 6, 8);
	        LocalDate currentDate = LocalDate.now();
	        long totalDays = ChronoUnit.DAYS.between(birthDate, currentDate);

	        long years = totalDays / 365;
	        long remainingDays = totalDays % 365;
	        long months = remainingDays / 30;
	        long days = remainingDays % 30;

	        System.out.println("Years   : " + years);
	        System.out.println("Months  : " + months);
	        System.out.println("Days    : " + days);

	}

}
