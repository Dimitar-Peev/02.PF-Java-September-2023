package _12_FinalExamPreparation.PF_2023_September_2;

import java.util.Scanner;

public class _01_SecretChat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder messageBuilder = new StringBuilder(message); 
        String input = scanner.nextLine();

        while (!input.equals("Reveal")) {
            String[] commandParts = input.split(":\\|:");
            String commandName = commandParts[0]; 

            switch (commandName) {
                case "InsertSpace":
                    int index = Integer.parseInt(commandParts[1]);
                    messageBuilder.insert(index, " ");
                    System.out.println(messageBuilder);
                    break;
                case "Reverse":
                    String substring = commandParts[1]; 
                    if (messageBuilder.toString().contains(substring)) {
                        int indexOfSubstring = messageBuilder.indexOf(substring);
                        messageBuilder.delete(indexOfSubstring, indexOfSubstring + substring.length() + 1);
                        String reversedSubstring = new StringBuilder(substring).reverse().toString();
                        messageBuilder.append(reversedSubstring);

                        System.out.println(messageBuilder);
                    } else {
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String textForReplace = commandParts[1];
                    String replacementText = commandParts[2];
                    messageBuilder = new StringBuilder(messageBuilder.toString().replaceAll(textForReplace, replacementText));
                    System.out.println(messageBuilder);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("You have a new text message: " + messageBuilder);
    }
}
