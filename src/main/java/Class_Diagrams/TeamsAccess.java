package Class_Diagrams;

import java.util.List;

public interface TeamsAccess {

	List<Team> listOfTeams = null;

	/**
	 * 
	 * @param nowyTeam
	 */
	void addTeam(Team newTeam);

	/**
	 * 
	 * @param teamID
	 */
	void deleteTeam(int teamID);

	/**
	 * 
	 * @param teamID
	 */
	void updateTeam(int teamID);

	/**
	 * 
	 * @param teamID
	 */
	Team getTeam(int teamID);

}
