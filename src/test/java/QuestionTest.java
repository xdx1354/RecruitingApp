import Class_Diagrams.QuestionHardSkills;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionTest {

    QuestionHardSkills question1;
    QuestionHardSkills question2;
    QuestionHardSkills question3;

    @BeforeEach
    public void setUp() {
        HashMap<Character, String> answers1 = new HashMap<>();
        Integer ID1 = 1;
        String text1 = "Jak chcesz zaliczyc ten kurs?";
        answers1.put('A', "Przepisem");
        answers1.put('B', "Piszac egzamin");

        HashMap<Character, String> answers2 = null;
        Integer ID2 = 2;
        String text2 = "What is the meaning of life?";
        ;
        HashMap<Character, String> answers3 = null;
        Integer ID3 = 3;
        String text3 = null;

        question1 = new QuestionHardSkills('A', text1, ID1, answers1);
        question2 = new QuestionHardSkills('A', text2, ID2, answers2);
        question3 = new QuestionHardSkills('A', text3, ID3, answers3);
    }

    @Test
    public void testGetQuestionTextWithAnswers() {
        String formattedText = question1.getQuestionText();

        String expectedText = "Jak chcesz zaliczyc ten kurs?\n" +
                "A. Przepisem\n" +
                "B. Piszac egzamin\n";

        assertEquals(expectedText, formattedText);
    }

    @Test
    public void testGetQuestionTextWithoutAnswers() {
        // Act
        String formattedText = question2.getQuestionText();

        // Assert
        assertEquals("Jaki jest sens zycia?\n", formattedText);
    }

    @Test
    public void testGetQuestionTextWithoutTextAndAnswers() {
        String formattedText = question3.getQuestionText();

        assertEquals("To pytanie nie zawiera tekstu", formattedText);
    }
}