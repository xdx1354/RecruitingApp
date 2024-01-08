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
	private Results results;					// changed from collection
	private TestHard testHard;
	private TestSoft testSoft;

	public Candidate() {
		// TODO - implement Candidate.Candidate
		throw new UnsupportedOperationException();
	}

	public  Candidate(String name, String surname) {

		this.name = name;
		this.surname = surname;
		this.completedHard = false;
		this.completedSoft = false;
		// generate new Result obj
		this.results = new Results();
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

	@Override
	public String toString() {
		return "Candidate{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", team=" + team +
				", token='" + token + '\'' +
				", completedSoft=" + completedSoft +
				", completedHard=" + completedHard +
				", results=" + results +
				", testHard=" + testHard +
				", testSoft=" + testSoft +
				'}';
	}
}