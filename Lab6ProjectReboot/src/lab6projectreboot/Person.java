/*
 * @author dacs0
 * @version 1.2
 * @since 03/25/2021
 * ITSC1213 156
 */
package lab6projectreboot;

/**
 *
 * @author dacs0
 */
public class Person {
	private String name;
    private int id;

	 /**
	  * Constructor for person class
	  * @param name
	  * @param id 
	  */
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public int getId() {
        return id;
    }
    
	 public String toString() {
		 return "name=" + name + ", id=" + id;
	 }
}
