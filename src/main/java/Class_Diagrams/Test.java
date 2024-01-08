package Class_Diagrams;

import java.util.*;

public class Test {

	private HashMap<Integer, Question> questions;

	public Test(HashMap<Integer, Question> questions) {
		this.questions = questions;
	}

	/**
	 * 
	 * @param testNumber
	 */
	public void takeTest(int testNumber) {
		for (Map.Entry<Integer, Question> entry : questions.entrySet()) {
			Integer questionId = entry.getKey();
			Question question = entry.getValue();
			System.out.println("Question ID: " + questionId);
			System.out.println("Question: " + question.getQuestionText());
			// Print other question details as needed
		}
	}

	public HashMap<Integer, Question> getQuestions() {
		return questions;
	}

	public void setQuestions(HashMap<Integer, Question> questions) {
		this.questions = questions;
	}
}