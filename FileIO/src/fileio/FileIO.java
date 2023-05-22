/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */
package fileio;
import java.io.*;
import java.util.*;
/**
 *
 * @author dacs0
 */
public class FileIO {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
	}
	public static void copyFile(String fileName, String fileName2) {
		String line;
		File file = new File(fileName);
		File file2 = new File(fileName2);
		try {
			BufferedReader rdr = new BufferedReader(new FileReader(file));
			StringBuffer sB = new StringBuffer();
			Scanner scnr = new Scanner (file);
			while ((line = rdr.readLine()) != null) {
				
			}
		} 
		catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
	public static void translateFile(String fileName, String fileName2) {
		
	}
}
