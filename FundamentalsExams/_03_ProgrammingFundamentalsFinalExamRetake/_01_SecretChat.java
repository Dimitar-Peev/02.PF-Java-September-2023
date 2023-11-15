package FundamentalsExams._03_ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class _01_SecretChat {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        StringBuilder concealedMessage = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!"Reveal".equals(input)) {
            String[] commandArray = input.split(":\\|:");
            String commandName = commandArray[0];

            switch (commandName) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandArray[1]);
                    concealedMessage.insert(index, " ");
                    System.out.println(concealedMessage);
                    break;
                case "Reverse":
                    String substringToReverse = commandArray[1];
                    if (concealedMessage.indexOf(substringToReverse) == -1) {
                        System.out.println("error");
                    } else {
                        StringBuilder substring = new StringBuilder(substringToReverse);
                        int firstIndex = concealedMessage.indexOf(substringToReverse);
                        int lastIndex = firstIndex + (substringToReverse.length());
                        concealedMessage.delete(firstIndex,lastIndex);
                        concealedMessage.append(substring.reverse());
                        System.out.println(concealedMessage);
                    }
                    break;
                case "ChangeAll":
                    String substring = commandArray[1];
                    String replacement = commandArray[2];
                    String replacedString = concealedMessage.toString().replaceAll(substring, replacement);
                    concealedMessage.replace(0, concealedMessage.length(), replacedString);
                    System.out.println(concealedMessage);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s", concealedMessage);
    }
}
