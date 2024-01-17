package Class_Diagrams;

import java.util.ArrayList;
import java.util.List;

public interface TeamsAccess {

	List<Team> listOfTeams = new ArrayList<>();

	/**
	 * 
	 * @param newTeam
	 */
	void addTeam(Team newTeam);

	/**
	 * 
	 * @param teamID
	 */
	boolean deleteTeam(String teamID);

	/**
	 * 
	 * @param teamID
	 */
	void updateTeam(int teamID);

	/**
	 * 
	 * @param teamID
	 */
	Team getTeam(String teamID);

}
