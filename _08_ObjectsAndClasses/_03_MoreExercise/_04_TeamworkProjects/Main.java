package _08_ObjectsAndClasses._03_MoreExercise._04_TeamworkProjects;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Team> teamsList = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split("-");
            String user = inputArr[0];
            String teamName = inputArr[1];

            if (isTeamExist(teamsList, teamName)) {
                System.out.printf("Team %s was already created!%n", teamName);
            } else if (!isTeamExist(teamsList, teamName) && isCreatorOrMemberExist(teamsList, user)) {
                System.out.printf("%s cannot create another team!%n", user);
            } else {
                Team team = new Team();
                team.setCreator(user);
                team.setTeam(teamName);
                teamsList.add(team);
                System.out.printf("Team %s has been created by %s!%n", teamName, user);
            }
        }

        String input = scanner.nextLine();
        while (!"end of assignment".equals(input)) {
            String[] command = input.split("->");
            String user = command[0];
            String teamName = command[1];

            if (!isTeamExist(teamsList, teamName)) {
                System.out.printf("Team %s does not exist!%n", teamName);
            } else if (isTeamExist(teamsList, teamName) && isCreatorOrMemberExist(teamsList, user)) {
                System.out.printf("Member %s cannot join team %s!%n", user, teamName);
            } else {
                for (Team teams : teamsList) {
                    if (teams.getTeam().contains(teamName)) {
                        teams.addMember(user);
                        break;
                    }
                }
            }

            input = scanner.nextLine();
        }

        teamsList.sort(Comparator.comparingInt(Team::getNumberOfMembers).reversed().thenComparing(Team::getTeam));

        print(teamsList);
    }

    private static void print(List<Team> teamsList) {
        for (Team currentTeam : teamsList) {
            Collections.sort(currentTeam.getMembers());
            if (!currentTeam.getMembers().isEmpty()) {
                System.out.println(currentTeam.getTeam());
                System.out.printf("- %s%n", currentTeam.getCreator());
                for (String member : currentTeam.getMembers()) {
                    System.out.printf("-- %s%n", member);
                }
            }
        }

        System.out.println("Teams to disband:");
        for (Team disbandTeam : teamsList) {
            if (disbandTeam.getMembers().isEmpty()) {
                System.out.println(disbandTeam.getTeam());
            }
        }
    }

    private static boolean isCreatorOrMemberExist(List<Team> teamsList, String person) {

        for (Team creator : teamsList) {
            if (creator.getCreator().contains(person) || creator.getMembers().contains(person)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isTeamExist(List<Team> teamsList, String teamToJoin) {
        for (Team team : teamsList) {
            if (team.getTeam().contains(teamToJoin)) {
                return true;
            }
        }
        return false;
    }
}
