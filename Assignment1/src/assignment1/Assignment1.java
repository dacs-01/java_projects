/*
 * @author dacs0
 * @version 1.1
 * @since 2021/03/02
 * ITSC1213 Section 156
 * Assignment 1 - Craps Game "Assignment Juan"
 */
package assignment1;

/**
 *
 * This program is designed to run 100,000 rounds of craps, but only printing out the first ten rounds.
 * @author dacs0
 */
public class Assignment1 
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) 
	{

		// Declare 6 different variables. Set rnd to 1 because round starts at 1, not 0.
		int point = 0;
		int rnd = 1;
		boolean rndEnd;
		
		int win = 0;
		int loss = 0;
		int roll = 0;
		
		// While loop that keeps going until round reaches 100,000
		while (rnd <= 100000)
		{
			rndEnd = false;
			if (rnd < 11) // If round is less than 11, print out the statement below to keep track of rounds.
			{
				System.out.print("Round: " + rnd + " , ");
			}
			
			// Nested while loop that determines whether or not the round is over.
			while (!rndEnd)
			{
				roll++;
				if (rnd < 11) // If round is less than 11, print out the statement below to keep track of the rolls.
				{
					System.out.print(" Roll " + roll);
				}
				// These are the dice numbered 1 thru 6 that will be used in the game.
				int die1 = (int)(Math.random()*6 + 1);
				int die2 = (int)(Math.random()*6 + 1);
		
				if (rnd < 11) // If round is less than 11, print out the statement below that gives the numbers of both die.
				{
					System.out.print(" -- Die1: " + die1 + " Die2: " + die2);
				}
				int dieSum = die1 + die2;

				if (rnd < 11) // If round is less than 11, print out the statement below to return the die sum.
				{
					System.out.println(" -- Total: " + dieSum);
				}

				if (roll == 1) // If the first roll is equal to 7 or 11, the round is tallied as a win and ends the round.
				{
					if (dieSum == 7 || dieSum == 11)
					{
						win++;
						rndEnd = true;
						if (rnd < 11)
						{
						System.out.println("WIN!");
						}
					}

				else if (dieSum == 2 || dieSum == 3 || dieSum == 12) // If the first roll is equal to 2, 3, or 12, it is an automatic loss.
				{
					loss++;
						rndEnd = true;
						if (rnd < 11)
						{
						System.out.println("LOSS!");
						}
				}

				else // If the first roll was any other number than the five numbers stated previously, it will continue rolling.
				{
					point = dieSum; // Sets the first roll sum as the point of the round.
					if (rnd < 11)
					{
						System.out.println("Point = " + point);
					}
				}

					}
				else 
				{
					if (dieSum == point) // If the sum of die is equal to the first point, consider it a win.
					{
						win++;
						rndEnd = true;
						if (rnd < 11)
						{
						System.out.println("WIN!");
						}

					}
					else if (dieSum == 7) // If the sum is a 7, it is a loss and ends the round.
					{
						loss++;
						rndEnd = true;
						if (rnd < 11)
						{
						System.out.println("LOSS!");
						}
					}
				}
		
			}
			if (rnd < 11)
			{
				System.out.println(win + " win(s) " + ", " + loss + " loss(es)");
            System.out.println();

			}
		roll = 0;
		rnd++;	
		}
		
	System.out.println("OVERALL:");
	System.out.println(win + " win(s) " + ", " + loss + " loss(es)");
   System.out.println();
	}
}

