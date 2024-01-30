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
	public boolean addRecruiter(Recruiter nowyRekruter) {

		return false;
	}

	@Override
	public boolean deleteRecruiter(int recruiterID) {

		return false;
	}

	@Override
	public boolean updateRecruiter(int recruiterID) {

		return false;
	}

	@Override
	public void getWorker(int workerID) {

	}
}