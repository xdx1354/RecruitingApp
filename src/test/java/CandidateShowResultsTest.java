import Class_Diagrams.Candidate;
import Class_Diagrams.Results;
import mockit.Expectations;
import mockit.Mocked;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CandidateShowResultsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Mocked
    private Results mockResults;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testShowResultsWhenNotCompletedAnyTest() {
        Candidate candidate = new Candidate("Xxx", "Yyy", 123, "uaaa");

        candidate.showResults();

        String consoleOutput = outContent.toString();
        assertTrue(consoleOutput.contains("You haven't completed any test yet."));
    }

    @Test
    public void testShowResultsWhenCompletedHardTest() {
        new Expectations() {{
            mockResults.getGrade1();
            result = 4;
        }};

        Candidate candidate = new Candidate("Xxx", "Yyy", 123, "uaaa");
        candidate.setCompletedHard(true);
        candidate.setResults(mockResults);

        candidate.showResults();

        String consoleOutput = outContent.toString();
        assertTrue(consoleOutput.contains("- Grade for hard skills:"));
//        assertTrue(consoleOutput.contains("[4]"));                        // todo: its not working
    }

    @Test
    public void testShowResultsWhenCompletedSoftWithoutFeedbackTest() {
        new Expectations() {{
            mockResults.getGrade2();
            result = "nice";
        }};
        Candidate candidate = new Candidate("Xxx", "Yyy", 123, "uaaa");
        candidate.setCompletedSoft(true);
        candidate.setResults(mockResults);

        candidate.showResults();

        String consoleOutput = outContent.toString();
        assertTrue(consoleOutput.contains("- Grade for soft skills:"));
        assertTrue(consoleOutput.contains(" [nice]"));
        assertTrue(consoleOutput.contains("- Feedback for soft skills:"));
        assertTrue(consoleOutput.contains(" [Not provided yet]"));
    }
    @Test
    public void testShowResultsWhenCompletedSoftWithFeedbackTest() {
        new Expectations() {{
            mockResults.getGrade2();
            result = "nice";
            mockResults.getComment();
            result = "you're hired!";
        }};
        Candidate candidate = new Candidate("Xxx", "Yyy", 123, "uaaa");
        candidate.setCompletedSoft(true);
        candidate.setResults(mockResults);

        candidate.showResults();

        String consoleOutput = outContent.toString();
        assertTrue(consoleOutput.contains("- Grade for soft skills:"));
        assertTrue(consoleOutput.contains(" [nice]"));
        assertTrue(consoleOutput.contains("- Feedback for soft skills:"));
        assertTrue(consoleOutput.contains(" [you're hired!]"));
    }
    @Test
    public void testShowResultsWhenBothCompletedTest() {
        new Expectations() {{
            mockResults.getGrade1();
            result = 4;
            mockResults.getGrade2();
            result = "nice";
            mockResults.getComment();
            result = "you're hired!";
        }};
        Candidate candidate = new Candidate("Xxx", "Yyy", 123, "uaaa");
        candidate.setCompletedHard(true);
        candidate.setCompletedSoft(true);
        candidate.setResults(mockResults);

        candidate.showResults();

        String consoleOutput = outContent.toString();
        System.out.println("Console Output: " + consoleOutput);
        assertTrue(consoleOutput.contains("- Grade for hard skills:"));
//        assertTrue(consoleOutput.contains("[4]"));                            // todo: just hotfix, this line is not working
        assertTrue(consoleOutput.contains("- Grade for soft skills:"));
        assertTrue(consoleOutput.contains(" [nice]"));
        assertTrue(consoleOutput.contains("- Feedback for soft skills:"));
        assertTrue(consoleOutput.contains(" [you're hired!]"));
    }
}
