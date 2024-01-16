import Class_Diagrams.Candidate;
import Class_Diagrams.Question;
import Class_Diagrams.Results;
import Class_Diagrams.User;
import mockit.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;

public class TestTests {

    @Mocked
    private User user;

    @Mocked
    private Scanner scanner;

    private Test test;

    /*
    @Test
    void testTakeTest(@Mocked Scanner scanner){
        Map<Integer, Question> questions = new HashMap<>();
        questions.put(1, new Question("What is your name?", null));
        questions.put(2, new Question("How do you handle stress?", null));

        // Set up yourClassUnderTest with the mocked questions
        yourClassUnderTest.setQuestions(questions);

        // Mock user.getResults() to avoid null pointer exception
        new Expectations() {{
            Candidate.getResults(); result = new Results();
        }};

        // Mock user input for the questions
        new Expectations() {{
            scanner.next(); returns("A", "B"); // Mock answers for HARD SKILLS questions
            scanner.nextLine(); result = "I handle stress well"; // Mock answer for SOFT SKILLS question
        }};

        // Call the method under test
        Class_Diagrams.Test.takeTest();

        // Verify the expected calls to user.getResults().setAnswer
        new VerificationsInOrder() {{
            user.getResults().setAnswer(1, 1, "A"); times = 1;
            user.getResults().setAnswer(1, 2, "B"); times = 1;
            user.getResults().setAnswer(2, 2, "I handle stress well"); times = 1;
        }};
    }
    */
}
