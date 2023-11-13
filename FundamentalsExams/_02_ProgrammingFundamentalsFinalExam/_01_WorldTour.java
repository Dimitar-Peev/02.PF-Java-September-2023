package FundamentalsExams._02_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class _01_WorldTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder initialDestination = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {
            String[] commandParts = input.split(":");
            String commandName = commandParts[0];

            switch (commandName) {
                case "Add Stop":
                    int index = Integer.parseInt(commandParts[1]);
                    String stopToInsert = commandParts[2];
                    if (isInvalidIndex(index, initialDestination)) {
                        initialDestination.insert(index, stopToInsert);
                    }
                    System.out.println(initialDestination);
                    break;
					
                case "Remove Stop":
                    int removeStartIndex = Integer.parseInt(commandParts[1]);
                    int removeEndIndex = Integer.parseInt(commandParts[2]);
                    if (isInvalidIndex(removeStartIndex, initialDestination)
                            && isInvalidIndex(removeEndIndex, initialDestination)) {
                        initialDestination.delete(removeStartIndex, removeEndIndex + 1);
                    }
                    System.out.println(initialDestination);
                    break;
					
                case "Switch":
                    String oldString = commandParts[1];
                    String newString = commandParts[2];
                    String destinationAsString = initialDestination.toString();
                    destinationAsString = destinationAsString.replace(oldString,newString);
                    initialDestination = new StringBuilder(destinationAsString);
                    System.out.println(initialDestination);
                    break;
            }
			
            input = scanner.nextLine();
        }

        System.out.printf("Ready for world tour! Planned stops: %s", initialDestination);
    }

    public static boolean isInvalidIndex(int index, StringBuilder text) {
        if (index >= 0 && index < text.length()) {
            return true;
        }
        return false;
    }
}
