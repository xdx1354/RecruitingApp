package Class_Diagrams;

public class CandidateBuilder {
	private String name;
	private String surname;
	private Integer id;
	private String token;
	private static Character nextToken = 'A';

	public CandidateBuilder(Integer id) {
		name = "<EMPTY>";
		surname = "<EMPTY>";
		this.id = id;
		token = "";
	}

	public CandidateBuilder addNameSurname(String name, String surname) {
		this.name = name;
		this.surname = surname;
		return this;
	}

	public Candidate build() {
		token = generateToken();
		return new Candidate(name, surname, id, token);
	}

	private String generateToken() {
		char c = nextToken;
		nextToken++;
		return Character.toString(c);
	}
}