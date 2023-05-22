
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.imageio.ImageIO;


/*
 * @author dacs0
 * @version 1.2
 * @since 4/22/2021
 * ITSC1213 156
 */
public class PostGenerator {
    private final ArrayList<User> users;
    private final Random rng;
    
	 private File imageDirectory;
    private File[] images;
    private String[] captions;
    private String[] texts;
    
    public PostGenerator(ArrayList<User> users)
    {
        // Assign users field
        this.users = users; 
        
        // Instantiate the Random object
        rng = new Random();
        
        
        /*
        Get the images, image captions, and texts        
        */
        
        // Get the images
        imageDirectory = new File("resources/images/");
        images = imageDirectory.listFiles();
        
        // Strip off the 1st one because that's the caption file
        images = Arrays.copyOfRange(images, 1, images.length);
        
        // Get the captions
        captions = new String[images.length];
        try {
            Scanner scan = new Scanner(new File("resources/images/captions.txt"));
            for(int i=0;i<captions.length;i++)
            {
                captions[i] = scan.nextLine();
            }
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
        
        // Get the texts
        try {
            Scanner scan = new Scanner(new File("resources/text_posts.txt"));
            int count=0;
            while(scan.hasNextLine())
            {
                count++;
                scan.nextLine();
            }
            texts = new String[count];
            scan = new Scanner(new File("resources/text_posts.txt"));
            for(int i=0;i<count;i++)
            {
                texts[i] = scan.nextLine();
            }       
        }
        catch(FileNotFoundException ex)
        {
            ex.printStackTrace();
        }
    }

    public File[] getImages() {return images;}
    public void setImages(File[] images) {this.images = images;}

    public String[] getCaptions() {return captions;}
    public void setCaptions(String[] captions) {this.captions = captions;}
    
    public String[] getTexts() {return texts;}
    public void setTexts(String[] texts) {this.texts = texts;}

    /**
	  * This method generates a text post using a date and time
	  * @param date
	  * @param time
	  * @return 
	  */
    public Post generateTextPost(String date, String time) {
		 int randTPost = rng.nextInt(5);
		 TextPost tp = new TextPost();
		 tp.setDate(date);
		 tp.setTime(time);
		 tp.setText(texts[randTPost]);
		 int user = rng.nextInt(4);
		 tp.setUser(users.get(user));
		 return tp;
	 }
    /**
	  * This method generates an image post using date and time
	  * @param date
	  * @param time
	  * @return
	  * @throws IOException 
	  */
	 public Post generateImagePost(String date, String time) throws IOException {
		 int randIPost = rng.nextInt(5);
		 Image image = ImageIO.read(images[randIPost]);
		 ImagePost ip = new ImagePost(image, captions[randIPost]);
		 ip.setDate(date);
		 ip.setTime(time);
		 int user = rng.nextInt(4);
		 ip.setUser(users.get(user));
		 return ip;
	 }
	 /**
	  * This method gets the month from an integer between 1 and 12
	  * @param month
	  * @return 
	  */
	 private String getMonthStr(int month) {
		 if (month == 1) {
			 return "Jan";
		 }
		 else if (month == 2) {
			 return "Feb";
		 }
		 else if (month == 3) {
			 return "Mar";
		 }
		 else if (month == 4) {
			 return "Apr";
		 }
		 else if (month == 5) {
			 return "May";
		 }
		 else if (month == 6) {
			 return "Jun";
		 }
		 else if (month == 7) {
			 return "Jul";
		 }
		 else if (month == 8) {
			 return "Aug";
		 }
		 else if (month == 9) {
			 return "Sep";
		 }
		 else if (month == 10) {
			 return "Oct";
		 }
		 else if (month == 11) {
			 return "Nov";
		 }
		 else if (month == 12) {
			 return "Dec";
		 }
		 else {
			 return null;
		 }
		 
	 }
	 /**
	  * This method generates a post including dates,times, and whether its an image or text post.
	  * @return
	  * @throws IOException 
	  */
	 public Post generatePost() throws IOException {
		 int monthGen = rng.nextInt(12);
		 String dateGen = getMonthStr(monthGen);
		 dateGen += " " + (rng.nextInt(30) + 1);
		 String hourGen = String.valueOf(rng.nextInt(12) + 1);
		 int secGen = rng.nextInt(60);
		 if (secGen != 0) {
			 hourGen += ":" + secGen;
		 }
		 else {
			 hourGen += ":00";
		 }
		 int randPost = rng.nextInt(2);
		 if (randPost == 0) {
			 return generateImagePost(dateGen, hourGen);
		 }
		 else {
			 return generateTextPost(dateGen, hourGen);
		 }
	 }
	 /**
	  * This method will generate a certain amount of posts
	  * @param num
	  * @return
	  * @throws IOException 
	  */
	 public Post[] generatePosts(int num) throws IOException {
		 Post[] posts = new Post[num];
		 for (int i = 0; i < num; i++) {
			 posts[i] = generatePost();
		 }
		 return posts;
	 }
}
