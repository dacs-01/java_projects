/*
 * @author dacs0
 * @version 1.0
 * @since 4/8/2021
 * ITSC1213 156
 */
package lab7;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Lab 7 - Book Reader 
 * 
 * The purpose of this lab is to read text files and copy/paste onto a new document.
 * @author dacs0
 */
public class Lab7 {

	/**
	 * Driver code for Lab 7 classes
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		String chapName1 = "slaughterhouse_five_chapter_1.txt";
		BookChapter slaughterhouseChap = BookChapterReadWrite.loadBookChapterFromFile(chapName1);
		BookChapterReadWrite.writeBookChapterToFile(slaughterhouseChap, "testFile.txt");
		
		System.out.println(slaughterhouseChap);
		System.out.println(" ");
		String chapName2 = "game_of_thrones_chapter_1.txt";
		
		BookChapter gameofthronesChap = BookChapterReadWrite.loadBookChapterFromFile(chapName2);
		BookChapterReadWrite.writeBookChapterToFile(gameofthronesChap, "testFile2.txt");
		System.out.println(gameofthronesChap);
	}
	
}
