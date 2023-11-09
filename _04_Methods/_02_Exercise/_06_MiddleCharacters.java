package _04_Methods._02_Exercise;

import java.util.Scanner;

public class _06_MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        printMiddleCharacters(text);
    }

    public static void printMiddleCharacters (String text) {
        int length = text.length();

        if (length % 2 != 0) {
            int indexOfMiddleCharacter = length / 2;
            System.out.println(text.charAt(indexOfMiddleCharacter));
        } else {
            int indexFirstMiddleCharacter = length / 2 - 1;
            int indexSecondMiddleCharacter = length / 2;

            System.out.print(text.charAt(indexFirstMiddleCharacter));
            System.out.print(text.charAt(indexSecondMiddleCharacter));
        }
    }
}
