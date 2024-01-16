import Class_Diagrams.Candidate;
import Class_Diagrams.Results;
import Class_Diagrams.TestHard;
import Class_Diagrams.TestSoft;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Mocked;
import mockit.Tested;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CandidateTests {

    @Injectable
    private TestHard mockTestHard;

    @Injectable
    private TestSoft mockTestSoft;

    @Injectable
    private Results mockResults;

    @Tested
    private Candidate candidate;

    @BeforeEach
    void setCandidate() {
        candidate = new Candidate("Adam", "Malysz", 0, "token123");
    }

    @Test
    void testTakeTestWithHardTest() {

        // mocking take test
        new Expectations() {{
            mockTestHard.takeTest();
            times = 1;
        }};

        candidate.takeTest(mockTestHard);

        assertTrue(candidate.isCompletedHard());

        assertSame(mockTestHard, candidate.getTestHard());
    }


    @Test
    void testTakeTestWithSoftTest() {
        new Expectations() {{
            mockTestSoft.takeTest();
            times = 1;
        }};

        candidate.takeTest(mockTestSoft);

        assertTrue(candidate.isCompletedSoft());

        assertSame(mockTestSoft, candidate.getTestSoft());
    }

    /*
    @Test
    void showResultsTestWithNoTestCompleted(){
        new Expectations() {{

            candidate.getResults();
            result = mockResults;

            candidate.isCompletedHard();
            result = false;
            candidate.isCompletedSoft();
            result = false;
        }};

        candidate.showResults();
        assertTrue(System.out.toString().contains("You haven't completed any test yet."));
    }

    @Test
    void showResultsTestWithOnlyHardTestCompleted() {
        new Expectations() {{
            candidate.isCompletedHard();
            result = true;
            mockResults.getGrade1();
            result = 30; // Mock the grade for hard skills
            candidate.isCompletedSoft();
            result = false;
            mockResults.getComment();
            result = null;
        }};

        candidate.showResults();
        assertTrue(System.out.toString().contains("Grade for hard skills: [30]"));
    }

    @Test
    void showResultsTestWithOnlySoftTestCompletedAndNoComment(){
        new Expectations() {{
            candidate.isCompletedHard();
            result = false;
            candidate.isCompletedSoft();
            result = true;

            candidate.getResults();
            result = mockResults;

            mockResults.getGrade2();
            result = 30;
            mockResults.getComment();
            result = null;
        }};

        candidate.showResults();
        assertTrue(System.out.toString().contains("- Grade for soft skills:  [30]"));
        assertTrue(System.out.toString().contains("Feedback for soft skills:  [Not provided yet]"));
    }
     */

}
