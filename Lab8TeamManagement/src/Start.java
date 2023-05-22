/*
 * @author dacs0
 * @version 1.0
 * @since 04/29/21
 * ITSC1213 156
 */
import java.io.*;
import java.util.*;
/**
 * Lab 8 - Team Management
 * 
 * The purpose of this project is to gather information from a file with players from
 * a team and inputting them into an ArrayList, as well as sorting them into a new file.
 * 
 * @author dacs0
 */
public class Start {
	/**
	 * Main driver code
	 * @param args 
	 */
	public static void main(String[] args) {
	/**		 	 
	Player p1 = new Player("Miles Bridges", 21, 0, Position.FORWARD);
	Player p2 = new Player("Nicholas Batum", 24, 5, Position.FORWARD);
	Player p3 = new Player("Malik Monk", 21, 1, Position.GUARD);
	System.out.println(p1.compareTo(p2));
	System.out.println(p1.compareTo(p3));
	System.out.println(p2.compareTo(p3));
	
	Player p1 = new Player("Miles Bridges", 21, 0, Position.FORWARD);
	Player p2 = new Player("Nicholas Batum", 24, 5, Position.FORWARD);
	Player p3 = new Player("Malik Monk", 21, 1, Position.GUARD);
	Team team = new Team("Hornets", "Charlotte");
	team.addPlayer(p3);
	team.addPlayer(p1);
	team.addPlayer(p2);
	System.out.println(team);
	System.out.println("Sorting the players\n");
	team.sortPlayers();
	System.out.println(team);
	*/
	String inputFileName = "team.txt";
	Team team = loadTeamFromFile(inputFileName);
	if(team != null){
		team.sortPlayers();
		String outputFileName = "sortedteam.txt";
		writeTeamToFile(team, outputFileName);
	System.out.println(team);
}
	}
	/**
	 * This method loads from the chosen file and scans through each line, 
	 * as well as making a player object using the information provided.
	 * 
	 * @param fileName
	 * @return team
	 */
	public static Team loadTeamFromFile(String fileName) {
		Team team = null;
		try {
			File file = new File(fileName);
			Scanner sc = new Scanner(file);
			String teamName = sc.nextLine();
			String teamCity = sc.nextLine();
			team = new Team(teamName, teamCity);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String playerData[] = line.split("\\t");
				Player p = new Player(playerData[0], Integer.parseInt(playerData[1]), 
						  Integer.parseInt(playerData[2]), Position.valueOf(playerData[3]));
				team.addPlayer(p);
			}
			sc.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("The file cannot be found");
		}
		return team;
	}
	/**
	 * This method copies and sorts player information from one file to another.
	 * @param team
	 * @param fileName 
	 */
	public static void writeTeamToFile(Team team, String fileName) {
		try {
			File file = new File(fileName);
			PrintWriter pw = new PrintWriter(file);
			pw.println(team.getName());
			pw.println(team.getCity());
			ArrayList<Player> players = team.getPlayers();
			for (int i = 0; i < players.size(); i++){
			pw.println(players.get(i).toString());
			}
			pw.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
