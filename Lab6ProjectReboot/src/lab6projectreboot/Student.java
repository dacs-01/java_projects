/*
 * @author dacs0
 * @version 1.2
 * @since 03/25/2021
 * ITSC1213 156
 */
package lab6projectreboot;

/**
 * This method extends the person class
 * @author dacs0
 */
public class Student extends Person {
	
	private String major;
    private double gpa;
   /**
	 * Constructor method for student class
	 * @param name
	 * @param id
	 * @param major
	 * @param gpa 
	 */
    public Student(String name, int id, String major, double gpa) {
        super(name, id);
        this.major = major;
        this.gpa = gpa;
    }

    /**
     * Get the value of major
     *
     * @return the value of major
     */
    public String getMajor() {
        return major;
    }

    /**
     * Get the value of gpa
     *
     * @return the value of gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * Set the value of major
     *
     * @param major new value of major
     */
    public void setMajor(String major) {
        this.major = major;
    }
    /**
     * Set the value of gpa
     *
     * @param gpa new value of gpa
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    } 
    public String toString() {
		 return "name=" + getName() + ", id=" + getId() + ", major=" + major + ", GPA=" + gpa;
	 }
}
