package com.neco4j.clock;

import java.util.Scanner;

/**
 * ClockTest class to test clock
 * @author Necati Kartal
 */
public class ClockTest {
	/**
	 * Main method to test clock
	 * @param args
	 * @throws if any exception handled
	 */
	public static void main(String[] args) {
		Clock localTimeZone = new Clock(0, 0, 0);
		localTimeZone.setName("Local Time Zone");
		Scanner stdin = new Scanner(System.in);
		
		boolean condition = true;
		do {
			try {
				localTimeZone.displayTime();
				
				System.out.println("Enter local hour:");
				localTimeZone.setHour(stdin.nextInt()); // get input from user
				System.out.println("Enter local minute:");
				localTimeZone.setMinute(stdin.nextInt()); // get input from user
				System.out.println("Enter local second:");
				localTimeZone.setSecond(stdin.nextInt()); // get input from user
				localTimeZone.displayTime();
				
				Clock europeTimeZone = new Clock(localTimeZone.getHour() + 2, localTimeZone.getMinute(), localTimeZone.getSecond());
				europeTimeZone.setName("Europe Time Zone");
				europeTimeZone.displayTime();
				
				localTimeZone.incrementHour(5);
				localTimeZone.displayTime();
				
				stdin.close();
				condition = false;
			} // end try
			catch (Exception exception) {
				//exception.printStackTrace(); // handling exceptions
				//System.err.printf( "\nException: %s\n", exception );
				System.out.println("Invalid characters: Please try again:\n");
				stdin.nextLine();
			} // end catch
		} while (condition);
	} // end method main
} // end class ClockTest