package FitNesseTests;

import Class_Diagrams.*;

public class AdminActionsFixture {
    public Admin admin;
    public AdminActions adminActions;
    public Integer recruiterID;

    public AdminActionsFixture() {
        admin = new Admin();
        adminActions = new AdminActions();

        // filling with initial data
        Recruiter r1 = new Recruiter(1);
        adminActions.addRecruiter(r1);

        Recruiter r2 = new Recruiter(2);
        adminActions.addRecruiter(r2);
    }

    public boolean addRecruiter() {
        return adminActions.addRecruiter(new Recruiter(recruiterID));
    }

    public boolean deleteRecruiter() {
        return adminActions.deleteRecruiter(recruiterID);
    }

    public boolean updateRecruiter() {
        return adminActions.updateRecruiter(recruiterID);
    }

    public void setRecruiterID(int recruiterID) {
        this.recruiterID = recruiterID;
    }
}
