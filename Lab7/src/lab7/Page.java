/*
 * @author dacs0
 * @version 1.2
 * @since 4/8/2021
 * ITSC1213 156
 */
package lab7;

/**
 * This class can construct page objects using a string array lines.
 * @author dacs0
 */
public class Page {
	
	private String[] lines;

	public Page(int numLines) {
		this.lines = new String[numLines];
	}
	public Page(String[] L) {
		this.lines = L;
	}
	
	/**
	 * Get the value of string
	 *
	 * @return the value of string
	 */
	public String[] getLines() {
		return lines;
	}

	/**
	 * Set the value of string
	 *
	 * @param lines new value of string
	 */
	public void setLines(String[] lines) {
		this.lines = lines;
	}

}
