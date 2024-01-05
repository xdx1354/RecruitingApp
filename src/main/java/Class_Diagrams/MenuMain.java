package Class_Diagrams;

public interface MenuMain {

	void MenuMain();

	void login();

	/**
	 * 
	 * @param Candidate
	 */
	void runMenuCandidate(int Candidate);

	/**
	 * 
	 * @param Recruiter
	 */
	void runMenuRecruiter(int Recruiter);

	/**
	 * 
	 * @param Admin
	 */
	void runMenuAdmin(int Admin);

}