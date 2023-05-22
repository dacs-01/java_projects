/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package magicsquare;

import java.io.*;
import java.util.*;

/**
 * This class will read the file and check if it's a magic square.
 * 
 * @author dacs0
 */
public class MagicSquare 
{
	// Private fields to be utilized in the readFile() method.
	private int order;
	private File file;
	private int[][] mat;
	
	private int row = 0;
	private int col = 0;
	private int diagSum1 = 0;
	
	private int diagSum2 = 0;
	private int rowSum = 0;
	private int colSum = 0;

	/**
	 * Constructor that uses the text file.
	 * @param file 
	 */
	public MagicSquare(File file) 
	{
		this.file = file;
	}

	public int getDiagSum1() 
	{
		return diagSum1;
	}

	public int getDiagSum2() 
	{
		return diagSum2;
	}

	public int getRowSum() 
	{
		return rowSum;
	}

	public int getColSum() 
	{
		return colSum;
	}

	public int getOrder() 
	{
		return order;
	}

	/**
	 * This method will read the file input and switch the text to integers, simply by iterating through each line of text and saving the values into a matrix.
	 * 
	 * @throws FileNotFoundException
	 * @throws IOException 
	 */
	public void readFile() throws FileNotFoundException, IOException 
	{
		BufferedReader rdr = new BufferedReader(new FileReader(file));
		int count;
		String[] strings;
		String readLine;
		
		// The reader will read through the first row of the matrix, splitting numbers by whitespace.
		readLine = rdr.readLine();
		strings = readLine.split("\\s");
		count = strings.length;
		mat = new int[count][count];
		
		// The count of digits in first row will be equal to number of columns, since it is a square.
		for (col = 0; col < count; col++) 
		{
			// This loop will get each value of the first row and store it into a 2D array.
			mat[row][col] = Integer.valueOf(strings[col]);
		}
		row++;
		
		// While loop that iterates through the lines of matrix to get the rest of the numbers.
		while ((readLine = rdr.readLine()) != null) 
		{
			strings = readLine.split("\\s");
			// Loop that gathers numbers in the rest of the file and stores into a 2D array.
			for (col=0; col < count; col++) 
			{
				mat[row][col] = Integer.valueOf(strings[col]);
			}
			row++;
		}
	
		// If the number of rows and columns equal each other, there's a chance that it could be a magic square.
		if (row == col) 
		{
			order = row;
			System.out.println("It might be a magic square! Let's find out shall we?");
			System.out.println("");
			
			// Gets the sum of the first diagonal.
			for (int i = 0; i < order; i++) 
			{
			diagSum1 += mat[i][i];
			}
			System.out.println("The first diagonal is " + diagSum1);
			
			// Gets the sum of the second diagonal.
			for (int i = 0; i < order; i++) 
			{
				diagSum2 += mat[i][order-1-i];
			}
			System.out.println("The second diagonal is " + diagSum2);
			System.out.println("");
			
			// Gets the sum of each row.
			for (int i = 0; i < order; i++) 
			{
				for (int j = 0; j < order; j++) 
				{
					rowSum += mat[i][j];
				}
				System.out.println("Row " + i + " sum: " + rowSum);
				rowSum = 0;
			}
			System.out.println("");
			
			// Gets the sum of each column.
			for (int i = 0; i < order; i++) 
			{
				for (int j = 0; j < order; j++) 
				{
					colSum += mat[j][i];
				}
				System.out.println("Column " + i + " sum: " + colSum);
				colSum = 0;
			}
			System.out.println("");		
		}
		else 
		{
			System.out.println("It's definitely not a magic square. Formatting is wrong.");
		}
	}
	
	/**
	 * Method that returns the information about the square.
	 * @return 
	 */
	@Override
	public String toString() 
	{
		return "The square has an order of " + order + "\n" + "The file name is: " + file + "\n" + "The square matrix is: " + Arrays.deepToString(mat) + "\n" + "Amount of rows: " + row + "\n" + "Amount of columns: " + col;
	}	
}
