package Class_Diagrams;

import java.util.HashMap;
import java.util.Map;

public class TestHard extends Test {


	private HashMap<Integer, QuestionHardSkills> questions;

	public TestHard(HashMap<Integer, QuestionHardSkills> questions) {
		super(new HashMap<>(questions)); // Super constructor call
		this.questions = questions;
	}


	/**
	 * 
	 * @param userResults
	 */
	public Results gradeTest(Results userResults) {
		HashMap<Integer, Integer> testHardResults = (HashMap<Integer, Integer>) userResults.getAnswers1();
		int grade = 0;

		for (Map.Entry<Integer, Integer> userAnswer : testHardResults.entrySet()) {
			Integer questionId = userAnswer.getKey();
			Integer pickedAnswer = userAnswer.getValue();

			QuestionHardSkills question = null;
			try {
				question = questions.get(questionId);
			} catch (IndexOutOfBoundsException e) {
				System.out.println("Index is out of bounds. No element at the specified index.");
			}

			if (question != null) {
				Integer correctAnswer = question.getAnswerCorrect();

				if (correctAnswer != null && correctAnswer.equals(pickedAnswer)) {
					System.out.println("Pytanie " + questionId + ": Poprawna odpowiedź!");
					grade++;
				} else {
					System.out.println("Pytanie " + questionId + ": Niepoprawna odpowiedź.");
				}
			} else {
				System.out.print("Pytanie " + questionId + ": Niepoprawny typ pytania lub brak pytania o danym ID.");
			}
		}

		userResults.setGrade1(grade);
		return userResults;
	}

	public HashMap<Integer, QuestionHardSkills> getQuestions() {
		return questions;
	}
}