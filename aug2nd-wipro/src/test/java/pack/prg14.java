package pack;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class prg14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ZonedDateTime timeInIndia = ZonedDateTime.now(ZoneId.of( "Asia/Kolkata" ));
	        System.out.println("Current time in India: " + timeInIndia);

	}

}
