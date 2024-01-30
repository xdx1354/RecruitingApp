package Class_Diagrams;

public interface workersAccess {
	/**
	 * @param nowyRekruter
	 * @return
	 */
	boolean addRecruiter(Recruiter nowyRekruter);

	/**
	 * @param recruiterID
	 * @return
	 */
	boolean deleteRecruiter(int recruiterID);

	/**
	 * @param recruiterID
	 * @return
	 */
	boolean updateRecruiter(int recruiterID);

	/**
	 * 
	 * @param workerID
	 */
	void getWorker(int workerID);

}