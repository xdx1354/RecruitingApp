package Class_Diagrams;

import java.util.*;

public class Test {

	private HashMap<Integer, Question> questions;
	private Candidate user;

	public Test(HashMap<Integer, Question> questions) {
		this.questions = questions;
	}

	public void takeTest() {
		Scanner scanner = new Scanner(System.in);

		for (Map.Entry<Integer, Question> entry : questions.entrySet()) {
			Question question = entry.getValue();
			Integer questionID = entry.getKey();
			System.out.println('\n' + question.getQuestionText());
			System.out.print(": ");
			if (question.getAnswers() != null) {
				// HARD SKILLS
				char answer = scanner.next().charAt(0);
				user.getResults().setAnswer(1, questionID, String.valueOf(answer));
			} else {
				// SOFT SKILLS
				String answer = scanner.nextLine();
				user.getResults().setAnswer(2, questionID, answer);
			}
		}
	}

	public HashMap<Integer, Question> getQuestions() {
		return questions;
	}

	public void setQuestions(HashMap<Integer, Question> questions) {
		this.questions = questions;
	}

	public void setUser(Candidate user) {
		this.user = user;
	}
}