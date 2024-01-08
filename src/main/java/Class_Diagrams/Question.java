package Class_Diagrams;

import java.util.HashMap;
import java.util.Map;

public abstract class Question {

	private Integer ID;
	private String text;
	private Map<Character, String> answers;

	public Question(String text, Integer ID, HashMap<Character, String> answers) {
		this.ID = ID;
		this.text = text;
		this.answers = answers;
	}

	public Question(HashMap<Integer, Question> questions) {
	}

	public Map<Character, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Character, String> answers) {
		this.answers = answers;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getQuestionText() {
		StringBuilder formattedText = new StringBuilder();
		formattedText.append(text).append("\n");
		for (Map.Entry<Character, String> entry : answers.entrySet()) {
			formattedText.append(entry.getKey()).append(". ").append(entry.getValue()).append("\n");
		}
		return formattedText.toString();
	}

}