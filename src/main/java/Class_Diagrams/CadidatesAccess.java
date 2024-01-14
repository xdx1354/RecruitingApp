package Class_Diagrams;

import java.util.List;

public interface CadidatesAccess {

	List<Candidate> listOfCandidates = null;

	/**
	 * 
	 * @param nowyKandydat
	 */
	void addCandidate(Candidate newCandidate);

	/**
	 * 
	 * @param candidateID
	 */
	void deleteCandidate(int candidateID);

	/**
	 * 
	 * @param candidateID
	 */
	void updateCandidate(int candidateID);

	/**
	 * 
	 * @param candidateID
	 */
	Candidate getCandidate(int candidateID);

}
