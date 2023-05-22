/*
 * @author dacs0
 * @version 1.2
 * @since 03/25/2021
 * ITSC1213 156
 */
package lab6projectreboot;

/**
 * This class expands the person class
 * @author dacs0
 */
public class Professor extends Person{
    
    private String department;
    private double salary;

	 /**
	  * Constructor for Professor class
	  * @param name
	  * @param id
	  * @param department
	  * @param salary 
	  */
    public Professor(String name, int id, String department, double salary) {
        super(name, id);
        this.department = department;
        this.salary = salary;
    }

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Get the value of department
     *
     * @return the value of department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Set the value of department
     *
     * @param department new value of department
     */
    public void setDepartment(String department) {
        this.department = department;
    }
    
    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }   
	 public String toString() {
		 return "name=" + getName() + ", id=" + getId() + ", department=" + department + ", salary=" + salary;
	 }
}
