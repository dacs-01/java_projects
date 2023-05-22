
import java.awt.*;
import java.io.File;

/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */

/**
 * This class extends Post using images and captions
 * @author dacs0
 */
public class ImagePost extends Post {
	private Image image;
	private String caption;

	/**
	 * Constructor for creating an image post object using an image and caption
	 * @param image
	 * @param caption 
	 */
	public ImagePost(Image image, String caption) {
		this.image = image;
		this.caption = caption;
	}

	/**
	 * gets the image
	 * @return image
	 */
	public Image getImage() {
		return image;
	}

	/**
	 * sets the image
	 * @param myImage 
	 */
	public void setImage(Image myImage) {
		image = myImage;
	}

	/**
	 * gets the caption
	 * @return caption
	 */
	public String getCaption() {
		return caption;
	}

	/**
	 * sets the caption
	 * @param caption 
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	
}
