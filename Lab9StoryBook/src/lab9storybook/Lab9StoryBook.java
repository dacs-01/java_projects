/*
 * @author dacs0
 * @version 1.0
 * @since 04/22/2021
 * ITSC1213 156
 */
package lab9storybook;

/**
 * The purpose of this project class is to create a storybook model GUI that the user can interact with.
 * @author dacs0
 */
public class Lab9StoryBook {

	/**
	 * Main driver code that pulls up the GUI.
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		StorybookModel myModel = new StorybookModel();
		StartFrame myStartFrame = new StartFrame(myModel);
		myStartFrame.setVisible(true);
	}
	
}
