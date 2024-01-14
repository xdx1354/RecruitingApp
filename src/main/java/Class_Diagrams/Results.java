package Class_Diagrams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Results {

	private Map<Integer, Integer> answers1;
	private Map<Integer, String> answers2;
	private Integer grade1;
	private String grade2;
	private String comment;

	public Results() {
		this.answers1 = new HashMap<>();
		this.answers2 = new HashMap<>();
		this.grade1 = null;
		this.grade2 = null;
		this.comment = null;
	}
	//TODO: add checking if question exists
	public void setAnswer(int Test, int questionID, String answer) {
		if (Test == 1) {
			answers1.put(questionID, QuestionHardSkills.mapAnswerToNumber(answer.charAt(0)));
		} else {
			answers2.put(questionID, answer);
		}
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

	public Map<Integer, String> getAnswers2() {
		return answers2;
	}

	public void setAnswers2(Map<Integer, String> answers2) {
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