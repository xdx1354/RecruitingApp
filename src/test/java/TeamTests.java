import Class_Diagrams.Candidate;
import Class_Diagrams.Team;
import mockit.Expectations;
import mockit.Injectable;
import mockit.Tested;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TeamTests {




    @Test
    void testMemberAdd() {
        Team team = new Team("10", "Hr");
        Candidate candidate = new Candidate("John", "Doe", 1, "123");

        // Test case
        team.memberAdd(candidate);

        // Verify that the team contains the member
        assertTrue(team.getMembers().contains(candidate));
    }

    @Test
    void testMemberAddAlreadyPresent() {

        Team team = new Team("10", "Hr");
        // Add a member to the team
        Candidate candidate = new Candidate("John", "Doe", 1, "123");
        team.memberAdd(candidate);

        // Attempt to add the same member again
        team.memberAdd(candidate);

        // Verify that the team still contains only one instance of the member
        assertEquals(1, team.getMembers().size());
    }

    @Test
    void testMemberDelete() {

        Team team = new Team("10", "Hr");
        // Add a member to the team
        Candidate candidate = new Candidate("John", "Doe", 1, "123");
        team.memberAdd(candidate);
        team.membersPrint();

        // Delete the member from the team
        team.memberDelete(candidate);
        team.membersPrint();

        // Verify that the team does not contain the deleted member
        assertFalse(team.getMembers().contains(candidate));
    }

    @Test
    void testDeleteMemberNotPresent() {
        Team team = new Team("10", "Hr");

        // Redirect standard output to capture console messages
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Attempt to delete a member not present in the team
        Candidate candidate = new Candidate("Jane", "Smith", 2, "456");
        team.memberDelete(candidate);

        // Verify that the console message indicates the member was not present
        assertEquals("This member is not in selected team", outputStream.toString());

        // Reset standard output
        System.setOut(originalOut);
    }
}
