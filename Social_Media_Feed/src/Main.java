
import java.util.ArrayList;
import javax.swing.JFrame;
/*
 * @author dacs0
 * @version 1.1
 * @since 4/22/2021
 * ITSC1213 156
 */

public class Main {

    /**
	  * Assignment 3 - Social Media Feed
	  * 
	  * The purpose of this project is to create a social media feed GUI that displays posts, captions, and users similar to a social media platform
     * @param args the command line arguments
	  * Driver code that generates randomized posts using the added users.
     */
    public static void main(String[] args) throws Exception {
        
        /*
            1. Create some User objects...        
        */
        User user1 = new User("dan");
		  User user2 = new User("casper");
		  User user3 = new User("jah");
		  User user4 = new User("elm st");
        
        ArrayList<User> users = new ArrayList<>();
		  users.add(user1);
		  users.add(user2);
		  users.add(user3);
		  users.add(user4);
		  
		  PostGenerator pg = new PostGenerator(users);
		  Post[] posts = pg.generatePosts(2);
        /*
            2. Put the User objects into an ArrayList        
        */
        
        /*
            3. Use your PostGenerator class to create posts from the users            
        */   
        
        
        /*
            Create the GUI window
            DO NOT ADD OR CHANGE CODE BELOW THIS POINT EXCEPT WHERE SPECIFIED        
        */
        Window myGUI = new Window();
        myGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGUI.pack();
        myGUI.setVisible(true);
        
        // ADD YOUR ARRAY OF POSTS AS AN ARGUMENT TO THIS METHOD CALL
        myGUI.displayPosts(posts);
    }
    
}
