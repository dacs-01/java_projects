 /*
 * @author dacs0
 * @version 1.0
 * @since 04/29/21
 * ITSC1213 156
 */

package magicsquare;
import java.util.*;
import java.io.*;
/**
 * Programming Assignment 4 - Magic Square
 * The purpose of this assignment is to read a text file with numbers to determine whether or not it is a magic square.
 * 
 * @author dacs0
 */
public class Main {

	/**
	 * @param args the command line arguments
	 * @throws java.io.IOException
	 */
	public static void main(String[] args) throws IOException 
	{
		// Use a scanner to get the file name from user's input.
		Scanner input = new Scanner(System.in);
		System.out.println("Type the entire file name please.");
		String filename = input.next();
		
		// Create a new file and use the Magic Square object to read the file.
		File file = new File(filename);
		MagicSquare ms = new MagicSquare(file);
		ms.readFile();
		
		// Use MagicSquareDetector object to check if it's a magic square.
		MagicSquareDetector msd = new MagicSquareDetector();
		msd.checkMagicSquare(ms);
		System.out.println(ms.toString());
	}
	
}
