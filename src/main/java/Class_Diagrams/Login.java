package Class_Diagrams;

public class Login implements workersAccess, CadidatesAccess {

	private String password;
	private String username;
	private String token;

	public Login() {
		// TODO - implement Login.Login
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param username
	 * @param password
	 */
	public User loginWorker(String username, String password) {
		// TODO - implement Login.loginWorker
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param token
	 */
	public User loginCandidate(String token) {
		// TODO - implement Login.loginCandidate
		throw new UnsupportedOperationException();
	}

	public Integer createNewCandidate() {
		// TODO - implement Login.createNewCandidate
		throw new UnsupportedOperationException();
	}

	@Override
	public void addCandidate(Candidate nowyKandydat) {

	}

	@Override
	public void deleteCandidate(int candidateID) {

	}

	@Override
	public void updateCandidate(int candidateID) {

	}

	@Override
	public Candidate getCandidate(int candidateID) {
		return null;
	}

	@Override
	public void addRecruiter(int nowyRekruter) {

	}

	@Override
	public void deleteRecruiter(int recruiterID) {

	}

	@Override
	public void updateRecruiter(int recruiterID) {

	}

	@Override
	public void getWorker(int workerID) {

	}
}