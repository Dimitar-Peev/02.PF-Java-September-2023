package FundamentalsExams._05_ProgrammingFundamentalsFinalExam;

import java.util.Scanner;

public class _01_ActivationKeys {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {
            String[] instructionParts = input.split(">>>");
            String instructionName = instructionParts[0];
            switch (instructionName) {
                case "Contains":
                    String substring = instructionParts[1];
                    if (activationKey.indexOf(substring) != -1) {
                        System.out.printf("%s contains %s%n", activationKey, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String upperOrLower = instructionParts[1];
                    int startIndex = Integer.parseInt(instructionParts[2]);
                    int endIndex = Integer.parseInt(instructionParts[3]);
                    if (upperOrLower.equals("Upper")) {
                        activationKey.replace(startIndex, endIndex, activationKey.substring(startIndex, endIndex).toUpperCase());
                    } else if (upperOrLower.equals("Lower")) {
                        activationKey.replace(startIndex, endIndex, activationKey.substring(startIndex, endIndex).toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                     startIndex = Integer.parseInt(instructionParts[1]);
                     endIndex = Integer.parseInt(instructionParts[2]);
                    activationKey.delete(startIndex, endIndex);
                    System.out.println(activationKey);
                    break;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s%n", activationKey);
    }

}
