package Class_Diagrams;

import java.util.List;

public interface workersAccess {

	List<Worker> listOfWorkers = null;

	/**
	 * 
	 * @param nowyRekruter
	 */
	void addRecruiter(int nowyRekruter);

	/**
	 * 
	 * @param recruiterID
	 */
	void deleteRecruiter(int recruiterID);

	/**
	 * 
	 * @param recruiterID
	 */
	void updateRecruiter(int recruiterID);

	/**
	 * 
	 * @param workerID
	 */
	void getWorker(int workerID);

}