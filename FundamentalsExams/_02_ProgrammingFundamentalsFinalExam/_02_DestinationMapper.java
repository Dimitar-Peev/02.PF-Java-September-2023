package FundamentalsExams._02_ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_DestinationMapper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String locations  = scanner.nextLine();

        String regex = "([=/])(?<places>[A-Z][a-zA-Z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(locations);

        ArrayList<String> validLocations = new ArrayList<>();
        int travelPoints = 0;

        while(matcher.find()) {
            validLocations.add(matcher.group("places"));
            travelPoints += matcher.group("places").length();
        }

        System.out.println("Destinations: " + String.join(", ", validLocations));
        System.out.println("Travel Points: " + travelPoints);

    }
}