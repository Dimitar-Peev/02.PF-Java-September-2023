package _14_FundamentalsExams._01_ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;

public class _01_TheImitationGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder modifyMessage = new StringBuilder(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("Decode")) {
            String[] commandArr = input.split("\\|");
            String command = commandArr[0];

            switch (command) {
                case "Move":
                    int countLetters = Integer.parseInt(commandArr[1]);
                    String firstLetters = modifyMessage.substring(0, countLetters);
                    modifyMessage.delete(0, countLetters);
                    modifyMessage.append(firstLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(commandArr[1]);
                    String textToInsert = commandArr[2];
                    modifyMessage.insert(index, textToInsert);
                    break;
                case "ChangeAll":
                    String textForChange = commandArr[1];
                    String replacement = commandArr[2];

                    String currentMessage = modifyMessage.toString();
                    currentMessage = currentMessage.replace(textForChange, replacement);
                    modifyMessage = new StringBuilder(currentMessage);
                    break;

            }
            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", modifyMessage);
    }
}
