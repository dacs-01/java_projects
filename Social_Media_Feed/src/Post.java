/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */

/**
 * This class is the abstract superclass that is extended by text post and image post classes
 * @author dacs0
 */
public abstract class Post {
	protected User user;
	private String date;
	private String time;

	/**
	 * gets the user
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * sets the user
	 * @param user 
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * gets the date
	 * @return date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * sets the date
	 * @param date 
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * gets the time
	 * @return time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * sets the time
	 * @param time 
	 */
	public void setTime(String time) {
		this.time = time;
	}
	
	/**
	 * gets the date and time
	 * @return 
	 */
	public String getDateAndTime() {
		return "Date: " + date + ", Time: " + time;
	}
}
