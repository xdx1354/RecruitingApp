import Class_Diagrams.QuestionHardSkills;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuestionHardSkillsTest {
    @Test
    public void forAAnswerShouldBe1(){
        assertEquals(1, QuestionHardSkills.mapAnswerToNumber('A'));
    }
    @Test
    public void foraAnswerShouldBe1(){
        assertEquals(1, QuestionHardSkills.mapAnswerToNumber('a'));
    }
    @Test
    public void forBAnswerShouldBe2(){
        assertEquals(2, QuestionHardSkills.mapAnswerToNumber('B'));
    }
    @Test
    public void forcAnswerShouldBe1(){
        assertEquals(3, QuestionHardSkills.mapAnswerToNumber('c'));
    }
    @Test
    public void forDAnswerShouldBe1(){
        assertEquals(4, QuestionHardSkills.mapAnswerToNumber('D'));
    }
    @Test
    public void forIncorrectAnswerShouldBeNegative1(){
        assertEquals(-1, QuestionHardSkills.mapAnswerToNumber('x'));
    }

}