package pack;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class prg11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDate givenDate = LocalDate.of(2003, 6, 8);
	        LocalDate currentDate = LocalDate.now();

	        Period period = Period.between(givenDate, currentDate);
	        long totalDays = ChronoUnit.DAYS.between(givenDate, currentDate);

	        System.out.println("Given Date: " + givenDate);
	        System.out.println("Current Date: " + currentDate);
	        System.out.println("Duration:");
	        System.out.println("Years: " + period.getYears());
	        System.out.println("Months: " + period.getMonths());
	        System.out.println("Days: " + period.getDays());
	        System.out.println("Total Days: " + totalDays);

	}

}
