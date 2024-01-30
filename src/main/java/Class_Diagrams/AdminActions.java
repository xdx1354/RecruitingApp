package Class_Diagrams;

import java.util.ArrayList;
import java.util.List;

public class AdminActions implements CadidatesAccess, TeamsAccess, TestAccess, workersAccess {

	private Admin admin;
	public List<Worker> listOfWorkers = new ArrayList<>();

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
	public boolean addRecruiter(Recruiter nowyRekruter) {
		if (nowyRekruter == null) {
			return false;
		}
		if (nowyRekruter.getId() < 0) {
			return false;
		}
		if (listOfWorkers == null) {
			listOfWorkers = new ArrayList<>();
		}
		if (!listOfWorkers.contains(nowyRekruter)) {
			listOfWorkers.add(nowyRekruter);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteRecruiter(int recruiterID) {
		if (listOfWorkers == null) {
			return false;
		}
		for (Worker w : listOfWorkers) {
			if (w.getId() == recruiterID) {
				listOfWorkers.remove(w);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean updateRecruiter(int recruiterID) {
		if (listOfWorkers == null) {
			return false;
		}
		for (Worker w : listOfWorkers) {
			if (w.getId() == recruiterID) {
				w.password = "password";
				return true;
			}
		}
		return false;
	}

	@Override
	public void getWorker(int workerID) {

	}
}