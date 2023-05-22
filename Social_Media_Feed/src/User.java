/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */

/**
 *
 * @author dacs0
 */
public class User {
	protected String name;

	/**
	 * Constructor for user object using a string name
	 * @param name 
	 */
	public User(String name) {
		this.name = name;
	}
/**
 * gets the name of user
 * @return name
 */
	public String getName() {
		return name;
	}
/**
 * sets the name of user
 * @param name 
 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
