/*
 * @author dacs0
 * @version 1.2
 * @since 4/8/2021
 * ITSC1213 156
 */
package lab7;
import java.io.*;
import java.util.*;
/**
 *
 * @author dacs0
 */
public class BookChapterReadWrite {
	
	/**
	 * This method scans the chapter text from file and adds pages to a newly created book object. 
	 * @param filename
	 * @return chap
	 * @throws FileNotFoundException
	 * @throws IOException 
	 */
	public static BookChapter loadBookChapterFromFile (String filename) throws FileNotFoundException, IOException {
		ArrayList<Page> pgs = new ArrayList<>();
		File file = new File(filename);
		Scanner scan = new Scanner(file);
		
		String title = scan.nextLine();
		String author = scan.nextLine();
		int linesPerPage = scan.nextInt();
		
		while(scan.hasNextLine()) {
			Page page = getPage(scan, linesPerPage);
			pgs.add(page);
		}
		scan.close();
		BookChapter chap = new BookChapter(linesPerPage, pgs, title, author);
		return chap;
	}
	
	/**
	 * This method gets the first three lines from book chapter, then iterates through ArrayList of
	 * Page to copy all of the text onto a new file.
	 * @param book
	 * @param filename
	 * @throws FileNotFoundException
	 * @throws IOException 
	 */
	public static void writeBookChapterToFile (BookChapter book, String filename) throws FileNotFoundException, IOException {
		FileWriter usedFile = new FileWriter(filename);
		PrintWriter pW = new PrintWriter(usedFile);
		pW.println(book.getTitle());
		
		pW.println(book.getAuthor());		
		pW.println(book.getLinesPerPage());
		ArrayList<Page> pg = book.getPages();
		
		for (Page pages : pg){
			String[] lines = pages.getLines();
			
			for (int i = 0; i < lines.length; i++){
				if (lines[i] != null) {
				pW.println(lines[i]);
				}
			}
		}
		pW.flush();
	}
	
	/**
	 * Gets the pages for the chapter used by the loadBookChapterFromFile method.
	 * @param scanner
	 * @param numLines
	 * @return 
	 */
	public static Page getPage(Scanner scanner, int numLines) {
		String line[] = new String[numLines];
		
		for (int i = 0; i < line.length && scanner.hasNextLine(); i++) {
			line[i] = scanner.nextLine();
		}
		Page page = new Page(line);
		return page;
	}
}
