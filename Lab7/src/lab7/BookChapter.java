/*
 * @author dacs0
 * @version 1.2
 * @since 4/8/2021
 * ITSC1213 156
 */
package lab7;

import java.util.*;

/**
 * This class holds constructors, getters, and setters utilizing the private variables within class.
 * @author dacs0
 */
public class BookChapter 
{
	
	private int linesPerPage;
	private ArrayList<Page> pages;
	private String title;
	private String author;

	/**
	 * 
	 * @param L 
	 */
	public BookChapter (int L)
	{
		setLinesPerPage(L);
	}
	/**
	 * Constructor with two parameters
	 * @param L
	 * @param p 
	 */
	public BookChapter (int L, ArrayList<Page> p) {
		setLinesPerPage(L);
		setPages(p);
	}
	/**
	 * Constructor with four parameters
	 * @param L
	 * @param p
	 * @param t
	 * @param a 
	 */
	public BookChapter (int L, ArrayList<Page> p, String t, String a) 
	{
		setLinesPerPage(L);
		setPages(p);
		setTitle(t);
		setAuthor(a);
	}
	/**
	 * Get the value of author
	 *
	 * @return the value of author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Set the value of author
	 *
	 * @param author new value of author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Get the value of title
	 *
	 * @return the value of title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Set the value of title
	 *
	 * @param title new value of title
	 */
	public void setTitle(String title) {
		this.title = title;
	}


	/**
	 * Get the value of pages
	 *
	 * @return the value of pages
	 */
	public ArrayList<Page> getPages() {
		return pages;
	}

	/**
	 * Set the value of pages
	 *
	 * @param pages new value of pages
	 */
	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}

	/**
	 * Get the value of linesPerPage
	 *
	 * @return the value of linesPerPage
	 */
	public int getLinesPerPage() {
		return linesPerPage;
	}

	/**
	 * Set the value of linesPerPage
	 *
	 * @param linesPerPage new value of linesPerPage
	 */
	public void setLinesPerPage(int linesPerPage) {
		this.linesPerPage = linesPerPage;
	}

	@Override
	public String toString() {
		return "Lines per page: " + linesPerPage + "\nPages: " + pages.size() + "\nTitle: " + title + "\nAuthor " + author;
	}

}
