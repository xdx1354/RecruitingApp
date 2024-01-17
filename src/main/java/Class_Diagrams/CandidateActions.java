package Class_Diagrams;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;

public class CandidateActions implements TestAccess {

    private final Candidate candidate;

    public CandidateActions(Candidate candidate) {
        this.candidate = candidate;
    }

    public void menuCandidate() {
        displayChoices();

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (!candidate.getResults().getAnswers1().isEmpty()){
                    System.out.println("You have already taken this test!");
                    break;
                }
                takeTest1();
                break;
            case 2:
                if (!candidate.getResults().getAnswers2().isEmpty()){
                    System.out.println("You have already taken this test!");
                    break;
                }
                takeTest2();
                break;
            case 3:
                showResults();
                break;
            case 4:
                System.out.println("Sending results...");
                // TODO: send results
                break;
            case 5:
                System.out.println("Logging out...");
                return;
            default:
                System.out.println("Invalid choice");
                break;
        }
        menuCandidate();
    }

    public void takeTest1() {
        System.out.println("Welcome to test hard skills!");
        Results results = candidate.takeTest(getTestHard());
    }

    public void takeTest2() {
        System.out.println("Welcome to test soft skills!");
        candidate.takeTest(getTestSoft());
    }

    public void showResults() {
        System.out.println("Your results:\n");
        candidate.showResults();
    }

    @Override
    public TestHard getTestHard() {
        HashMap<Character, String> answers1 = new HashMap<>();
        answers1.put('A', "TAK");
        answers1.put('B', "NIE");
        QuestionHardSkills questionHardSkills = new QuestionHardSkills('A', "Ala ma kota?", 1, answers1);
        HashMap<Character, String> answers2 = new HashMap<>();
        answers2.put('A', "TAK");
        answers2.put('B', "NIE");
        QuestionHardSkills questionHardSkills2 = new QuestionHardSkills('B', "Bartek ma psa?", 2, answers2);

        HashMap<Integer, QuestionHardSkills> questionHardSkillsHashMap = new HashMap<>();
        questionHardSkillsHashMap.put(1, questionHardSkills);
        questionHardSkillsHashMap.put(2, questionHardSkills2);

        return new TestHard(questionHardSkillsHashMap);
    }

    @Override
    public TestSoft getTestSoft() {
        HashMap<Integer, QuestionSoftSkills> questionSoftSkillsHashMap = new HashMap<>();
        QuestionSoftSkills questionSoftSkills = new QuestionSoftSkills("Czy lubisz pracować w zespole?", 1);
        QuestionSoftSkills questionSoftSkills2 = new QuestionSoftSkills("Czy lubisz pracować samodzielnie?", 2);
        questionSoftSkillsHashMap.put(1, questionSoftSkills);
        questionSoftSkillsHashMap.put(2, questionSoftSkills2);

        return new TestSoft(questionSoftSkillsHashMap);
    }

    public void displayChoices() {
        System.out.println("\nWelcome " + candidate.getName() + " " + candidate.getSurname() + "!");
        System.out.println("What would you like to do?");
        System.out.println("1. Take test hard skills");
        System.out.println("2. Take test soft skills");
        System.out.println("3. Show results");
        System.out.println("4. Send results");
        System.out.println("5. Log out");
        System.out.print(": ");
    }

    @Override
    public void updateTestHard(TestHard testHard) {

    }

    @Override
    public void updatedTestSoft(TestSoft testSoft) {

    }
}