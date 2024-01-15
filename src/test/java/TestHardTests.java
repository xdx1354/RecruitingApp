import Class_Diagrams.Results;
import Class_Diagrams.TestHard;
import Class_Diagrams.QuestionHardSkills;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.Verifications;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHardTests {

    @Injectable
    private Results mockUserResults;

    @Tested
    private TestHard testHard;

    @BeforeEach
    void setUp() {
        // Mock questions
        HashMap<Integer, QuestionHardSkills> mockQuestions = new HashMap<>();
        HashMap<Character, String> answers1 = new HashMap<>();
        answers1.put('A', "answer1");
        answers1.put('B', "answer1");
        answers1.put('C', "answer1");
        answers1.put('D', "answer1");
        mockQuestions.put(1, new QuestionHardSkills('A', "Question 1", 1, answers1));
        mockQuestions.put(2, new QuestionHardSkills('A', "Question 2", 2, answers1));

        // Set up testHard with the mocked questions
        testHard = new TestHard(mockQuestions);
    }

    @Test
    void testGradeTest() {
        // Mock user results
        HashMap<Integer, Integer> mockUserAnswers = new HashMap<>();
        mockUserAnswers.put(1, 1); // Correct answer for question 1
        mockUserAnswers.put(2, 1); // Incorrect answer for question 2

        new Expectations() {{
            mockUserResults.getAnswers1(); result = mockUserAnswers;
            mockUserResults.setGrade1(anyInt); // Capture the argument for setGrade1
        }};

        // Call the method under test
        Results gradedResults = testHard.gradeTest(mockUserResults);

        // Verify the expected grade
        new Verifications() {{
            int capturedGrade;
            mockUserResults.setGrade1(capturedGrade = withCapture());
            assertEquals(2, capturedGrade); // or the expected value based on your logic
        }};
    }
}
