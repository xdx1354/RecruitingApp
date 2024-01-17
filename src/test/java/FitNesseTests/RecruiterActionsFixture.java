package FitNesseTests;

import Class_Diagrams.Recruiter;
import Class_Diagrams.RectuiterActions;
import Class_Diagrams.TeamsAccess;

public class RecruiterActionsFixture {
    public Recruiter recruiter;
    public TeamsAccess teamsAccess;
    public RectuiterActions recruiterActions;

    RecruiterActionsFixture() {
        recruiter = new Recruiter(15);
        recruiterActions = new RectuiterActions();
        recruiterActions.setRecruiter(recruiter);

        // filling with initial data
//        Team t1 = new Team("1", "Team1");
//        teamsAccess.addTeam(t1);
//        Team t2 = new Team("2", "Team2");
//        teamsAccess.addTeam(t2);
    }

    /*
    SETS OF DATA FOR TESTING WITH EXPECTED RESULTS
    teamID = "1", teamName = "team1", TRUE
    teamID = "2", teamName = "team2", TRUE
    teamID = "3", teamName = "team3", TRUE
    teamID = "1", teamName = "team1", FALSE
    teamID = "", teamName = "team1", FALSE
    teamID = "", teamName = "", FALSE
    teamID = "1", teamName = "", FALSE
     */

    public boolean addTeam(String teamID, String teamName) {
        return recruiterActions.addTeam(teamID, teamName);
    }

}
