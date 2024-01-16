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

import static org.junit.jupiter.api.Assertions.*;

public class CandidateTests {

    @Injectable
    private TestHard mockTestHard;

    @Injectable
    private TestSoft mockTestSoft;

    @Injectable
    private Results mockResults;

    @Injectable
    private Class_Diagrams.Test mockTest;

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

    @Test
    void testTakeTestWithUndefinedTestType() {

        assertThrows(RuntimeException.class, () -> {
            candidate.takeTest(mockTest);
        });

    }


}
