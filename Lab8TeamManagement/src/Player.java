/*
 * @author dacs0
 * @version 1.2
 * @since
 * ITSC1213 156
 */

/**
 *
 * @author dacs0
 */
public class Player implements Comparable<Player> {
	
	private String name;
	
	private int age;

	private int jerseyNumber;

	private Position position;

	/**
	 * 
	 * @param name
	 * @param age
	 * @param jerseyNumber
	 * @param position 
	 */
	public Player(String name, int age, int jerseyNumber, Position position) {
		this.name = name;
		this.age = age;
		this.jerseyNumber = jerseyNumber;
		this.position = position;
	}

	/**
	 * Get the value of position
	 *
	 * @return the value of position
	 */
	public Position getPosition() {
		return position;
	}

	/**
	 * Set the value of position
	 *
	 * @param position new value of position
	 */
	public void setPosition(Position position) {
		this.position = position;
	}

	/**
	 * Get the value of jerseyNumber
	 *
	 * @return the value of jerseyNumber
	 */
	public int getJerseyNumber() {
		return jerseyNumber;
	}

	/**
	 * Set the value of jerseyNumber
	 *
	 * @param jerseyNumber new value of jerseyNumber
	 */
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}

	/**
	 * Get the value of age
	 *
	 * @return the value of age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Set the value of age
	 *
	 * @param age new value of age
	 */
	public void setAge(int age) {
		this.age = age;
	}


	/**
	 * Get the value of name
	 *
	 * @return the value of name
	 */
	public String getName() {
		return name;
	}

	
	@Override
	public String toString() {
		return name + "	" + age + "	  " + jerseyNumber + "	 " + position;
	}
/**
 * compares the players to see if they have the same position and jersey number
 * @param o
 * @return 0
 */
	@Override
  	public int compareTo(Player o) {
		int compare = position.compareTo(o.position);
			if (compare < 0) {
				return -1;
			}
			else if (compare > 0) {
				return 1;
			}
			else {
				if (this.jerseyNumber > o.jerseyNumber) {
					return 1;
				}
				else if (this.jerseyNumber < o.jerseyNumber) {
					return -1;
				}
				else {
					return 0;
				}
			}
	}
}
