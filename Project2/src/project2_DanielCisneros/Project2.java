/*
 * @author dacs0
 * @version 1.2
 * @since 2021/03/22
 * ITSC1213 156
 */
package project2_DanielCisneros;
import java.util.*;

/**
 *
 * @author dacs0
 */
public class Project2 {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) // driver code to calculate counting rectangles method.
	{
		Scanner scnr = new Scanner(System.in); // user input for variables.
		System.out.println("Type in an integer for variable n:");
		int n = scnr.nextInt(); // user input for variable n.
		
		System.out.println("Type in an integer for variable m:");
		int m = scnr.nextInt(); // user input for variable m.
		System.out.println("Number of rectangles in " + n + " x " + m + " grid: " + countRectangles(n, m));
	}
	
	public static int countRectangles(int n, int m) // method for counting rectangles in a grid.
	{
		return (m * (m + 1) * n * (n + 1)) / 4; // formula for counting rectangles in a grid.
	}
}
