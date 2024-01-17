import Class_Diagrams.Results;
import Class_Diagrams.TestHard;
import Class_Diagrams.QuestionHardSkills;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import mockit.Verifications;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    void testGradeTestCorrectAnswers() {
        // Mock user results
        HashMap<Integer, Integer> mockUserAnswers = new HashMap<>();
        mockUserAnswers.put(1, 1); // Correct answer for question 1
        mockUserAnswers.put(2, 1); // Correct answer

        new Expectations() {{
            mockUserResults.getAnswers1(); result = mockUserAnswers;
            mockUserResults.setGrade1(anyInt);
        }};

        // Call the method under test
        Results gradedResults = testHard.gradeTest(mockUserResults);

        // Verify the expected grade
        new Verifications() {{
            int capturedGrade;
            mockUserResults.setGrade1(capturedGrade = withCapture());
            assertEquals(2, capturedGrade);
        }};
    }

    @Test
    void testGradeTestInvalidAnswer() {
        HashMap<Integer, Integer> mockUserAnswers = new HashMap<>();
        mockUserAnswers.put(1,1); // Correct answer for question 1
        mockUserAnswers.put(2, 7); // Invalid answer for question 2

        new Expectations() {{
            mockUserResults.getAnswers1(); result = mockUserAnswers;
            mockUserResults.setGrade1(anyInt);  // capturing setting mockUserResults.setGrade1() to be visible outside
        }};

        Results gradedResults = testHard.gradeTest(mockUserResults);

        // Verify the expected grade
        new Verifications() {{
            int capturedGrade;
            mockUserResults.setGrade1(capturedGrade = withCapture());
            assertEquals(1, capturedGrade);
        }};

    }

    @Test
    void testGradeTestWithInvalidQuestionId() {
        // Redirect standard output to capture console messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));


        Results userResults = new Results();
        HashMap<Integer, Integer> answers = new HashMap<>();
        answers.put(100, 1); // Assuming 100 is an invalid questionId
        userResults.setAnswers1(answers);


        mockUserResults = testHard.gradeTest(userResults);


        assertEquals("Pytanie 100: Niepoprawny typ pytania lub brak pytania o danym ID.", outputStream.toString());


        System.setOut(System.out);
    }
}
