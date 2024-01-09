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
		this.type = UserType.CANDIDATE;
		this.team = null;
		this.token = token;
		this.completedSoft = false;
		this.completedHard = false;
		this.results = new Results();
		this.testHard = null;
		this.testSoft = null;
	}

	public Results takeTest(Test test) {
		test.setUser(this);
		test.takeTest();
		if (test instanceof TestHard) {
			this.completedHard = true;
			this.testHard = (TestHard) test;
		} else {
			this.completedSoft = true;
			this.testSoft = (TestSoft) test;
		}
		return results;
	}

	public void showResults() {
		if (!completedHard && !completedSoft) {
			System.out.println("You haven't completed any test yet.");
			return;
		}

		if (completedHard) {
			System.out.println("- Grade for hard skills: ");
			if (results.getGrade1() == null) {
				System.out.println(" [Not graded yet]");
			} else {
				System.out.println('[' + results.getGrade1() + ']');
			}
		}
		if (completedSoft) {
			System.out.println("- Grade for soft skills: ");
			if (results.getGrade2() == null) {
				System.out.println(" [Not graded yet]");
			} else {
				System.out.println(" [" + results.getGrade2() + ']');
			}
			System.out.println("- Feedback for soft skills: ");
			if (results.getComment() == null) {
				System.out.println(" [Not provided yet]");
			} else {
				System.out.println(" [" + results.getComment() + ']');
			}
		}
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
		return this.results;
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