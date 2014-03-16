package com.neco4j.clock;

/**
 * A small clock interface
 */
public interface IClock {
	
	/**
	 *  Sets hour, minute and second info
	 */
	void setClock(int hour, int minute, int second);
	 
	/**
	 *  Returns the time as a String
	 */
	String getClock(); 
	
	/**
	 *  Sets the hour. If hour is greater than 23 or less than 0 sets hour to 0 
	 */
	void setHour(int hour);
	 
	/**
	 *  Sets the minute. If minute is greater than 59 or less than 0 sets hour to 0 
	 */
	void setMinute(int minute);
	 
	/**
	 *  Sets the second. If second is greater than 59 or less than 0 sets hour to 0 
	 */
	void setSecond(int second); 
	 
	/**
	 *  Increments the hour value. If the hour value overflows than reset the hour value (%24) 
	 */
	void incrementHour();
	 
	/**
	 *  Increments the minute value. If the minute value overflows triggers the incrementHour method 
	 */
	void incrementMinute();
	 
	/**
	 *  Increments the second value. If the second value overflows triggers the incrementMinute method
	 */
	void incrementSecond();
		
	/**
	 *  Increments the hour value. If the hour value overflows than reset the hour value (%24)
	 */
	void incrementHour(int hour);
	 
	/**
	 *  Increments the minute value. If the minute value overflows triggers the incrementHour method 
	 */
	void incrementMinute(int minute);
	 
	/**
	 *  Increments the second value. If the second value overflows triggers the incrementMinute method
	 */
	void incrementSecond(int second); 
	 
	/**
	 *  Returns the hour value
	 */
	int getHour(); 
	 
	/**
	 *  Returns the minute value 
	 */
	int getMinute(); 
	 
	/**
	 *  Returns the second value 
	 */
	int getSecond();

	/**
	 *  Displays the time on standard output
	 */
	void displayTime(); 
	 
	/**
	 *  Sets the name of the clock 
	 */
	void setName(String name); 
	 
	/**
	 *  Returns the name of the clock
	 */
	String getName();
} // end interface IClock