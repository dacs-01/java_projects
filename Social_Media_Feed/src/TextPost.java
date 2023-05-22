/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */

/**
 * This class extends post by using text
 * @author dacs0
 */
public class TextPost extends Post {
	private String text;

	/**
	 * gets the text
	 * @return text
	 */
	public String getText() {
		return text;
	}

	/**
	 * sets the text
	 * @param text 
	 */
	public void setText(String text) {
		this.text = text;
	}
}
