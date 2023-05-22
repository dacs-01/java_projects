/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package lab9storybook;

/**
 * Class for the storybook model
 * @author dacs0
 */
public class StorybookModel {
	
	private String userName;

	private String crime;

	/**
	 * Get the value of crime
	 *
	 * @return the value of crime
	 */
	public String getCrime() {
		return crime;
	}

	/**
	 * Set the value of crime
	 *
	 * @param crime new value of crime
	 */
	public void setCrime(String crime) {
		this.crime = crime;
	}

	/**
	 * Get the value of userName
	 *
	 * @return the value of userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Set the value of userName
	 *
	 * @param userName new value of userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
