package Class_Diagrams;

import java.util.HashMap;
import java.util.Map;

public class QuestionHardSkills extends Question {


	private Character answerCorrect;

	public QuestionHardSkills(Character answerCorrect, String text, Integer ID, HashMap<Character, String> answers) {
		super(text, ID, answers);
		this.answerCorrect = answerCorrect;
	}


	public int mapAnswerToNumber(char answer) {
		return switch (Character.toUpperCase(answer)) {
			case 'A' -> 1;
			case 'B' -> 2;
			case 'C' -> 3;
			case 'D' -> 4;
			default -> -1; // Return -1 for invalid input or other characters
		};
	}

	public Integer getAnswerCorrect() {
		return mapAnswerToNumber(answerCorrect);
	}

	public void setAnswerCorrect(Character answerCorrect) {
		this.answerCorrect = answerCorrect;
	}
}