package Class_Diagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Results {

	private Map<Integer, Integer> answers1;
	private Map<Integer, Integer> answers2;
	private Integer grade1;
	private String grade2;
	private String comment;

	public Results() {
		this.answers1 = new HashMap<>();
		this.answers2 = new HashMap<>();
		this.grade1 = 0;
		this.grade2 = "brak oceny";
		this.comment = "brak komentarza";
	}

	/**
	 * 
	 * @param Integer
	 * @param questionID
	 * @param choosenAnswer
	 */
	public void setAnswer(int Integer, int questionID, int choosenAnswer) {
		// TODO - implement Results.setAnswer
		throw new UnsupportedOperationException();
	}


	@Override
	public String toString() {
		return "Results{" +
				"answers1=" + answers1 +
				", answers2=" + answers2 +
				", grade1=" + grade1 +
				", grade2='" + grade2 + '\'' +
				", comment='" + comment + '\'' +
				'}';
	}

	public Map<Integer, Integer> getAnswers1() {
		return answers1;
	}

	public void setAnswers1(Map<Integer, Integer> answers1) {
		this.answers1 = answers1;
	}

	public Map<Integer, Integer> getAnswers2() {
		return answers2;
	}

	public void setAnswers2(Map<Integer, Integer> answers2) {
		this.answers2 = answers2;
	}

	public Integer getGrade1() {
		return grade1;
	}

	public void setGrade1(Integer grade1) {
		this.grade1 = grade1;
	}

	public String getGrade2() {
		return grade2;
	}

	public void setGrade2(String grade2) {
		this.grade2 = grade2;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
}