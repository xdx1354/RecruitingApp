package Class_Diagrams;

import java.util.*;

public class Recruiter extends Worker implements TeamsAccess {

	TeamsAccess teamsAccess;

	public Recruiter(int id) {
		super.id = id;
		super.type = UserType.RECRUITER;

	}

	/**
	 * 
	 * @return
	 */
	public Collection<Results> showAllResults() {
		// TODO - implement Recruiter.showAllResults
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param candidateID
	 */
	public void addComment(int candidateID) {
		// TODO - implement Recruiter.addComment
		throw new UnsupportedOperationException();
	}

	/*
	Returns true if team was successfully added
	Returns false if team wasn't added due to:
	- empty ID
	- empty teamName
	- already existing (Checked by ID)
	 */
	public boolean createTeam(String teamId, String teamName) {

		if(teamId.isEmpty()){
			return  false;
		}
		if(teamName.isEmpty()){
			return false;
		}

		if(!listOfTeams.contains(getTeam(teamId))){
			Team newTeam = new Team(teamId, teamName);
			addTeam(newTeam);
			return true;
		};
		return false;
	}

	/**
	 * 
	 * @param teamID
	 * @param candidateID
	 */
	public void addCandidateToTeam(int teamID, int candidateID) {
		// TODO - implement Recruiter.addCandidateToTeam
		throw new UnsupportedOperationException();
	}

	public void showListOfAllCandiates() {
		// TODO - implement Recruiter.showListOfAllCandiates
		throw new UnsupportedOperationException();
	}


	@Override
	public void addTeam(Team newTeam) {
		listOfTeams.add(newTeam);
	}

	@Override
	public boolean deleteTeam(String teamID) {

		for (Team t: listOfTeams) {
			if(Objects.equals(t.getId(), teamID)) {
				listOfTeams.remove(t);
				return true;
			}
		};

		return  false;
	}

	@Override
	public void updateTeam(int teamID) {

	}

	@Override
	public Team getTeam(String teamID) {

		for (Team t: listOfTeams) {
			if(Objects.equals(t.getId(), teamID)) {
				return t;
			}
		};
		return null;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (!(obj instanceof Recruiter))
			return false;
		if (obj == this)
			return true;
		return Objects.equals(this.getId(), ((Recruiter) obj).getId());
	}
}