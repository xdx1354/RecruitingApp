import Class_Diagrams.QuestionHardSkills;
import Class_Diagrams.Results;
import mockit.Expectations;
import mockit.Mocked;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultsSetAnswerTest {

    @Test
    public void testSetAnswerForTest1(@Mocked QuestionHardSkills questionHardSkills) {
        Results results = new Results();

        new Expectations() {{
            QuestionHardSkills.mapAnswerToNumber('A');
            result = 1;
        }};

        results.setAnswer(1, 1, "A");

        Map<Integer, Integer> expectedAnswers1 = new HashMap<>();
        expectedAnswers1.put(1, 1);

        assertEquals(expectedAnswers1, results.getAnswers1());
    }

    @Test
    public void testSetAnswerForTest2() {
        Results results = new Results();

        results.setAnswer(2, 1, "Some answer");

        Map<Integer, String> expectedAnswers2 = new HashMap<>();
        expectedAnswers2.put(1, "Some answer");

        assertEquals(expectedAnswers2, results.getAnswers2());
    }

    @Test
    public void testSetAnswerForTest2MultipleQuestions() {
        Results results = new Results();

        results.setAnswer(2, 1, "Some answer1");
        results.setAnswer(2, 2, "Some answer2");
        results.setAnswer(2, 100, "Some answer100");

        Map<Integer, String> expectedAnswers2 = new HashMap<>();
        expectedAnswers2.put(1, "Some answer1");
        expectedAnswers2.put(2, "Some answer2");
        expectedAnswers2.put(100, "Some answer3");

        assertEquals(expectedAnswers2, results.getAnswers2());
    }@Test
    public void testSetAnswerForTest1WithMultipleQuestions() {
        Results results = new Results();

        new Expectations() {{
            QuestionHardSkills.mapAnswerToNumber('A');
            result = 1;
        }};

        results.setAnswer(1, 1, "A");
        results.setAnswer(1, 2, "B");
        results.setAnswer(1, 3, "C");

        Map<Integer, Integer> expectedAnswers1 = new HashMap<>();
        expectedAnswers1.put(1, 1);
        expectedAnswers1.put(2, 2);
        expectedAnswers1.put(3, 3);

        assertEquals(expectedAnswers1, results.getAnswers1());
    }

    @Test
    public void testSetAnswerForTest2WithInvalidQuestion() {
        Results results = new Results();

        results.setAnswer(2, 0, "Some answer");

        Map<Integer, String> expectedAnswers2 = new HashMap<>();

        assertEquals(expectedAnswers2, results.getAnswers2());
    }
}
