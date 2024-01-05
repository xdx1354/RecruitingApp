package Class_Diagrams;

import Class_Diagrams.Results;
import java.util.*;

public class Candidate extends User {

	private String name;
	private String surname;
	private Team team;
	private String token;
	private boolean completedSoft;
	private boolean completedHard;
	private Collection<Results> results;
	private TestHard testHard;
	private TestSoft testSoft;

	public Candidate() {
		// TODO - implement Candidate.Candidate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param testNumber
	 */
	public Results takeTest(int testNumber) {
		// TODO - implement Candidate.takeTest
		throw new UnsupportedOperationException();
	}

	public Results showResults() {
		// TODO - implement Candidate.showResults
		throw new UnsupportedOperationException();
	}

	public String getToken() {
		return this.token;
	}

	public String getName() {
		return this.name;
	}

	public String getSurname() {
		return this.surname;
	}

	/**
	 * 
	 * @param team
	 */
	public void setTeam(String team) {
		// TODO - implement Candidate.setTeam
		throw new UnsupportedOperationException();
	}

	public String getTeam() {
		// TODO - implement Candidate.getTeam
		throw new UnsupportedOperationException();
	}

	public Integer getID() {
		// TODO - implement Candidate.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param results
	 */
	public void saveResults(Results results) {
		// TODO - implement Candidate.saveResults
		throw new UnsupportedOperationException();
	}

	public Results getResults() {
		return (Results) this.results;
	}

}