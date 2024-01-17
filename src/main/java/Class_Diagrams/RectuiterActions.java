package Class_Diagrams;

public class RectuiterActions implements CadidatesAccess {

	private Recruiter recruiter;

	public void RecruiterFacade() {
		// TODO - implement RectuiterActions.RecruiterFacade
		throw new UnsupportedOperationException();
	}

	public void showListOfCandidates() {
		// TODO - implement RectuiterActions.showListOfCandidates
		throw new UnsupportedOperationException();
	}

	public void showListOfTeams() {
		// TODO - implement RectuiterActions.showListOfTeams
		throw new UnsupportedOperationException();
	}

	public void addComment() {
		// TODO - implement RectuiterActions.addComment
		throw new UnsupportedOperationException();
	}

	public boolean addTeam(String teamID, String teamName) {
		if (recruiter != null) {
			return recruiter.createTeam(teamID, teamName);
		} else {
			System.out.println("Recruiter not initialized.");
			return false;
		}
	}

	public void showAllResults() {
		// TODO - implement RectuiterActions.showAllResults
		throw new UnsupportedOperationException();
	}

	public void setRecruiter(Recruiter recruiter) {
		this.recruiter = recruiter;
	}

	@Override
	public void addCandidate(Candidate nowyKandydat) {

	}

	@Override
	public void deleteCandidate(int candidateID) {

	}

	@Override
	public void updateCandidate(int candidateID) {

	}

	@Override
	public Candidate getCandidate(int candidateID) {
		return null;
	}
}