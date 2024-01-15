import Class_Diagrams.Candidate;
import Class_Diagrams.CandidateActions;
import Class_Diagrams.QuestionHardSkills;
import Class_Diagrams.TestHard;
import mockit.Expectations;
import mockit.Injectable;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class CandidateActionsTests {
//    CandidateActionsTests(){};

    @Injectable
    private Candidate mockCandidate;

    @Test
    public void testGetTestHard() {

        // Create CandidateActions with the mockCandidate
        CandidateActions candidateActions = new CandidateActions(mockCandidate);

        // Call the method under test
        TestHard testHard = candidateActions.getTestHard();

        // Verify the returned TestHard object is not null
        assertNotNull(testHard);

        // Verify the content of the TestHard object
        Map<Integer, QuestionHardSkills> questions = testHard.getQuestions();
        assertNotNull(questions);
        assertEquals(2, questions.size()); // Assuming two questions based on your example

        // Verify the content of the first question
        QuestionHardSkills question1 = questions.get(1);
        assertNotNull(question1);
        assertEquals(Integer.valueOf(1), question1.getAnswerCorrect());
        assertEquals("Ala ma kota?", question1.getText());
        Map<Character, String> answers1 = question1.getAnswers();
        assertNotNull(answers1);
        assertEquals("TAK", answers1.get('A'));
        assertEquals("NIE", answers1.get('B'));

        // Verify the content of the second question
        QuestionHardSkills question2 = questions.get(2);
        assertNotNull(question2);
        assertEquals(Integer.valueOf(2), question2.getID());
        assertEquals("Bartek ma psa?", question2.getText());
        Map<Character, String> answers2 = question2.getAnswers();
        assertNotNull(answers2);
        assertEquals("TAK", answers2.get('A'));
        assertEquals("NIE", answers2.get('B'));
    }

}
