
import java.util.ArrayList;
import java.util.Collections;

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
public class Team {
	private String name;
	private String city;
	private ArrayList<Player> players = new ArrayList<>();

	/**
	 * Constructor for team object of name and city
	 * @param name
	 * @param city 
	 */
	public Team(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * gets the players from the array list of player
	 * @return 
	 */
	public ArrayList<Player> getPlayers() {
		return players;
	}
	
	public void addPlayer(Player p) {
		
		players.add(p);
	}
	
	/**
	 * sorts players by their positions
	 */
	public void sortPlayers() {
		Collections.sort(players);
	}
/**
 * prints out the team name and city, as well as roster of players
 * @return 
 */
	@Override
	public String toString() {
		String temp = name + "\n" + city + "\n" + "PLAYERS" + "\n";
		for (Player player: players) {
			temp += player.toString() + "\n";
		}
		return temp;
	}
}
