package Class_Diagrams;

public interface TestAccess {

	TestHard testHard = null;
	TestSoft testSoft = null;

	TestHard getTestHard();

	TestSoft getTestSoft();

	/**
	 * 
	 * @param testHard
	 */
	void updateTestHard(TestHard testHard);

	/**
	 * 
	 * @param testSoft
	 */
	void updatedTestSoft(TestSoft testSoft);

}