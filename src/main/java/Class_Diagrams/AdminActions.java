package Class_Diagrams;

public class AdminActions implements CadidatesAccess, TeamsAccess, TestAccess, workersAccess {

	private Admin admin;

	public void MenuAdmin() {
		// TODO - implement AdminActions.MenuAdmin
		throw new UnsupportedOperationException();
	}

	public void showListOfCandidates() {
		// TODO - implement AdminActions.showListOfCandidates
		throw new UnsupportedOperationException();
	}

	public void showListOfTeams() {
		// TODO - implement AdminActions.showListOfTeams
		throw new UnsupportedOperationException();
	}

	public void showTests() {
		// TODO - implement AdminActions.showTests
		throw new UnsupportedOperationException();
	}

	public void changeQuestion() {
		// TODO - implement AdminActions.changeQuestion
		throw new UnsupportedOperationException();
	}

	public void changeCandidateData() {
		// TODO - implement AdminActions.changeCandidateData
		throw new UnsupportedOperationException();
	}

	public void changeRecruiterData() {
		// TODO - implement AdminActions.changeRecruiterData
		throw new UnsupportedOperationException();
	}

	public Integer addRectuiter() {
		// TODO - implement AdminActions.addRectuiter
		throw new UnsupportedOperationException();
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

	@Override
	public void addTeam(Team newTeam) {
		listOfTeams.add(newTeam);
	}

	@Override
	public boolean deleteTeam(String teamID) {
		return  false;
	}

	@Override
	public void updateTeam(int teamID) {

	}

	@Override
	public Team getTeam(String teamID) {
		return null;
	}

	@Override
	public TestHard getTestHard() {
		return null;
	}

	@Override
	public TestSoft getTestSoft() {
		return null;
	}

	@Override
	public void updateTestHard(TestHard testHard) {

	}

	@Override
	public void updatedTestSoft(TestSoft testSoft) {

	}

	@Override
	public void addRecruiter(int nowyRekruter) {

	}

	@Override
	public void deleteRecruiter(int recruiterID) {

	}

	@Override
	public void updateRecruiter(int recruiterID) {

	}

	@Override
	public void getWorker(int workerID) {

	}
}