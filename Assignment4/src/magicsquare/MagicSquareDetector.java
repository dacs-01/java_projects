/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package magicsquare;

import java.io.IOException;

/**
 * This class will detect whether a matrix is a magic square or not.
 * @author dacs0
 */
public class MagicSquareDetector 
{

	public MagicSquareDetector() 
	{
	}
	/**
	 * This method checks to see if the text input is truly a magic square.
	 * @param ms 
	 */
	public void checkMagicSquare(MagicSquare ms) 
	{
		if (ms.getDiagSum1() == ms.getDiagSum2()) 
		{
			if (ms.getColSum() == ms.getRowSum()) 
			{
				// If the diagonal sums equal to each other, and if the sums of rows and columns equal, then it's a magic square.
				int magicConstant = ms.getDiagSum1();
				System.out.println("");
				System.out.println("It's a magic square!");
				System.out.println("The magic constant is " + magicConstant);
			}
		}
		else 
		{
			System.out.println("It's not a magic square.");
		}
	}
}
