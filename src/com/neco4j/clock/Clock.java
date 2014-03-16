package com.neco4j.clock;

/**
 *	A small clock class that implements clock interface
 */
public final class Clock implements IClock {
	private int hour;
	private int minute;
	private int second;
	private String name;
	
	/**
	 *  no-argument constructor
	 */
	public Clock() {
		this.hour = 0; // set hour as default
		this.minute = 0; // set minute as default
		this.second = 0; // set second as default
		this.name = "default"; // set name as default
	} // end no-argument Clock constructor
	 
	/**
	 *  three-argument constructor
	 */
	public Clock (int hour,int minute,int second) {	
		setHour(hour); // set hour
		setMinute(minute); // set minute
		setSecond(second); // set second
	} // end three-argument Clock constructor
	 
	/**
	 *  one-argument constructor
	 */
	public Clock (Clock clock) {
		setClock(clock.getHour(), clock.getMinute(), clock.getSecond());
	}  // end one-argument Clock constructor
	
	/**
	 * Sets the hour. If hour is greater than 23 or less than 0 sets hour to 0 
	 * @see com.neco4j.clock.IClock#setHour(int)
	 */
	@Override
	public void setHour(int hour) {
		if(hour > 23 || hour < 0)
			this.hour = 0;
		else
			this.hour = hour;
	} // end method setHour
	
	/**
	 * Returns the hour value
	 * @return hour
	 * @see com.neco4j.clock.IClock#getHour()
	 */
	@Override
	public int getHour() {
		return this.hour;
	} // end method getHour
	
	/**
	 * Sets the minute. If minute is greater than 59 or less than 0 sets hour to 0 
	 * @see com.neco4j.clock.IClock#setMinute(int)
	 */
	@Override
	public void setMinute(int minute) {
		if(minute > 59 || minute < 0)
			this.minute = 0;
		else
			this.minute = minute;
	} // end method setMinute
	
	/**
	 * Returns the minute value
	 * @return minute
	 * @see com.neco4j.clock.IClock#getMinute()
	 */
	@Override
	public int getMinute() {
		return this.minute;
	} // end method getMinute
	
	/**
	 * Sets the second. If second is greater than 59 or less than 0 sets hour to 0
	 * @see com.neco4j.clock.IClock#setSecond(int)
	 */
	@Override
	public void setSecond(int second) {
		if(second > 59 || second <0)
			this.second = 0;
		else
			this.second = second;
	} // end method setSecond
	
	/**
	 * Returns the second value
	 * @return second
	 * @see com.neco4j.clock.IClock#getSecond()
	 */
	@Override
	public int getSecond() {
		return this.second;
	} // end method getSecond
	
	/**
	 * Sets the name of the clock 
	 * @see com.neco4j.clock.IClock#setName(java.lang.String)
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	} // end method setName
	
	/**
	 * Returns the name of the clock
	 * @return name
	 * @see com.neco4j.clock.IClock#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	} // end method getName
	
	/**
	 * Sets hour, minute and second info
	 * @see com.neco4j.clock.IClock#setClock(int, int, int)
	 */
	@Override
	public void setClock(int hour, int minute, int second) {
		setHour(hour); // set hour
		setMinute(minute); // set minute
		setSecond(second); // set second
	} // end method setClock
	
	/**
	 * Returns the time as a String
	 * @see com.neco4j.clock.IClock#getClock()
	 */
	@Override
	public String getClock() {
		return getHour() + ":" + getMinute() + ":" + getSecond();
	} // end method getClock
	
	/**
	 * Increments the hour value. If the hour value overflows than reset the hour value (%24)
	 * @see com.neco4j.clock.IClock#incrementHour()
	 */
	@Override
	public void incrementHour() {
		if(this.hour == 23)
			this.hour = 0;
		else
			this.hour++;
	} // end method incrementHour
	
	/**
	 * Increments the minute value. If the minute value overflows triggers the incrementHour method
	 * @see com.neco4j.clock.IClock#incrementMinute()
	 */
	@Override
	public void incrementMinute() {
		if(this.minute == 59) {
			this.minute = 0;
			incrementHour();
		} else
			this.minute++;
	} // end method incrementMinute
	
	/**
	 * Increments the second value. If the second value overflows triggers the incrementMinute method
	 * @see com.neco4j.clock.IClock#incrementSecond()
	 */
	@Override
	public void incrementSecond() {
		if(this.second == 59) {
			this.second = 0;
			incrementMinute();
		} else
			this.second++;
	} // end method incrementSecond
	
	/**
	 * Increments the hour value. If the hour value overflows than reset the hour value (%24)
	 * @see com.neco4j.clock.IClock#incrementHour(int)
	 */
	@Override
	public void incrementHour(int hour) {
		if(this.hour == 23)
			this.hour = hour - 1;
		else
			this.hour += hour;
	} // end method incrementHour
	
	/**
	 * Increments the minute value. If the minute value overflows triggers the incrementHour method
	 * @see com.neco4j.clock.IClock#incrementMinute(int)
	 */
	@Override
	public void incrementMinute(int minute) {
		if(this.minute == 59) {
			this.minute = minute -1;
			incrementHour();
		} else
			this.minute += minute;
	} // end method incrementMinute
	
	/**
	 * Increments the second value. If the second value overflows triggers the incrementMinute method
	 * @see com.neco4j.clock.IClock#incrementSecond(int)
	 */
	@Override
	public void incrementSecond(int second) {
		if(this.second == 59) {
			this.second = second - 1;
			incrementMinute();
		} else
			this.second += second;
	} // end method incrementSecond
	
	/**
	 * Displays the time on standard output
	 * @see com.neco4j.clock.IClock#displayTime()
	 */
	@Override
	public void displayTime() {
		System.out.println(getName() + " - " + getClock());
	} // end method displayTime
	
	/**
	 * @return String representation of Clock class
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer(40);
		sb.append(getName());
		sb.append(" - ");
		sb.append(getHour());
		sb.append(":");
		sb.append(getMinute());
		sb.append(":");
		sb.append(getSecond());
		return sb.toString();
	} // end method toString
} // end class Clock