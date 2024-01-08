package Class_Diagrams;

public class UserFactory {
	private static UserFactory instance;
	private Integer idLast;

	private UserFactory() {
		idLast = 0;
	}

	public static UserFactory instance() {
		if (instance == null) {
			instance = new UserFactory();
		}
		return instance;
	}

	public CandidateBuilder beginCandidate() {
		return new CandidateBuilder(idLast++);
	}

	public RecruiterBuilder beginRecruiter() {
		// TODO - implement UserFactory.beginRecruiter
		throw new UnsupportedOperationException();
	}

	public AdminBuilder beginAdmin() {
		// TODO - implement UserFactory.beginAdmin
		throw new UnsupportedOperationException();
	}

}