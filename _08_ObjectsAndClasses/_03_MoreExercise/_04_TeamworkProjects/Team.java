package _08_ObjectsAndClasses._03_MoreExercise._04_TeamworkProjects;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String team;
    private String creator;
    private List<String> members;

    public Team() {
        setMembers(new ArrayList<>());
    }
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public int getNumberOfMembers() {
        return members.size();
    }

    public void addMember(String memberName) {
        members.add(memberName);
    }
}
