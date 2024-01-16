package Class_Diagrams;

import java.util.*;

public class Team {

	private String id;
	private ArrayList<Candidate> members;
	private String name;

	public Team(String id, String name) {
		this.id = id;
		this.name = name;
		members = new ArrayList<>();
	}

	/**
	 * 
	 * @param newMember
	 */
	public void memberAdd(Candidate newMember) {
		if(newMember.getTeam() != null){
			newMember.getTeam().memberDelete(newMember);
			System.out.println("Member was deleted from previous team");
		}

		if (!members.contains(newMember)) {
			members.add(newMember);
			newMember.setTeam(this);
			System.out.println("Member added to the team: " + newMember.getName());
		} else {
			System.out.println("Member is already present in the team: " + newMember.getName());
		}
	}


	public void memberDelete(Candidate memberToDelete) {
		if(members.contains(memberToDelete)){
			members.remove(memberToDelete);
			memberToDelete.setTeam(null);
		}
		else {
			System.out.print("This member is not in selected team");
			memberToDelete.setTeam(null);
		}

	}

	public void membersPrint() {
		System.out.println(members);
	}

	public Collection<Candidate> getMembers() {
		return members;
	}
}