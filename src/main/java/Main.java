import Class_Diagrams.*;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        // TODO: This will be handled in database implementation
        Candidate jk =
                UserFactory
                .instance()
                .beginCandidate()
                .addNameSurname("Jan", "Kowalski")
                .build();


        // TODO: Logging in will be here, change below to actual log in menu

        CandidateActions actions = new CandidateActions(jk);
        actions.menuCandidate();
    }
}
