import Class_Diagrams.Candidate;
import Class_Diagrams.QuestionHardSkills;
import Class_Diagrams.TestHard;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        Admin admin = new Admin();

//        System.out.println(admin.getId());

        Candidate candidate = new Candidate("Jan", "Kowalski" );

        //  creating two test questions
        HashMap <Character, String> answers1 = new HashMap<>();
        answers1.put('A', "TAK");
        answers1.put('B', "NIE");
        QuestionHardSkills questionHardSkills = new QuestionHardSkills('A',"Ala ma kota",1, answers1 );

        HashMap <Character, String> answers2 = new HashMap<>();
        answers2.put('A', "TAK");
        answers2.put('B', "NIE");
        QuestionHardSkills questionHardSkills2 = new QuestionHardSkills('B',"Bartek ma psa",2, answers2 );

        HashMap<Integer, QuestionHardSkills> questionHardSkillsHashMap = new HashMap<>();
        questionHardSkillsHashMap.put(1, questionHardSkills);
        questionHardSkillsHashMap.put(2, questionHardSkills2);


        TestHard testHard = new TestHard(questionHardSkillsHashMap);        // TODO: cast QuestionHardSkill to Questiopn

        testHard.takeTest(1);

        System.out.println(candidate.toString());

    }
}
