package Class_Diagrams;

import java.util.List;

public class Admin extends User {

	public Admin() {

		this.id = 1;
		System.out.println("COnst");

	}

	/**
	 * 
	 * @param testNumber
	 */
	public void changeQuestion(int testNumber) {
		// TODO - implement Admin.changeQuestion
		throw new UnsupportedOperationException();
	}

	public List<Test> showTests() {
		// TODO - implement Admin.showTests
		throw new UnsupportedOperationException();
	}

	public List<Candidate> showListOfCandidates() {
		// TODO - implement Admin.showListOfCandidates
		throw new UnsupportedOperationException();
	}

	public List<Recruiter> showListOfRecruiters() {
		// TODO - implement Admin.showListOfRecruiters
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param candidateID
	 */
	public void changeCandidateData(int candidateID) {
		// TODO - implement Admin.changeCandidateData
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param RecruiterID
	 */
	public void changeRecruiterData(int RecruiterID) {
		// TODO - implement Admin.changeRecruiterData
		throw new UnsupportedOperationException();
	}

	public Integer addRecruiter() {
		// TODO - implement Admin.addRecruiter
		throw new UnsupportedOperationException();
	}

}