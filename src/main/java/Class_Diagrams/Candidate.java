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

	public Candidate(String name, String surname, Integer id, String token) {
		this.name = name;
		this.surname = surname;
		this.id = id;
		this.team = null;
		this.token = token;
		this.completedSoft = false;
		this.completedHard = false;
		this.results = null;
		this.testHard = null;
		this.testSoft = null;
	}

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