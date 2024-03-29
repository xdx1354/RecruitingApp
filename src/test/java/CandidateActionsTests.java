import Class_Diagrams.*;
import mockit.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


public class CandidateActionsTests {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;
    @Injectable
    private Candidate mockCandidate;
    @Tested
    private CandidateActions candidateActions;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void testGetTestHard() {
        candidateActions = new CandidateActions(mockCandidate);

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

    @Test
    void testDisplayChoices() {
        new Expectations(){{
            mockCandidate = UserFactory.instance().beginCandidate().addNameSurname("A", "B").build();
            candidateActions = new CandidateActions(mockCandidate);
        }};

        candidateActions.displayChoices();
        String consoleOutput = outContent.toString();

        assertTrue(consoleOutput.contains("Welcome A B!"));
        assertTrue(consoleOutput.contains("What would you like to do?"));
        assertTrue(consoleOutput.contains("1."));
        assertTrue(consoleOutput.contains("2."));
        assertTrue(consoleOutput.contains("3."));
        assertTrue(consoleOutput.contains("4."));
        assertTrue(consoleOutput.contains("5."));
        assertTrue(consoleOutput.contains(": "));
    }
}
