package _10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _08_LettersChangeNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split("\\s+");
        double sum = 0;

        for (String input : data) {
            char firstLetter = input.charAt(0);
            char secondLetter = input.charAt(input.length() - 1);

            double number = Double.parseDouble(input.substring(1, input.length() - 1));

            if (Character.isLowerCase(firstLetter)) {
                sum += getPosition(firstLetter) * number;
            } else {
                sum += number / getPosition(firstLetter);
            }

            if (Character.isLowerCase(secondLetter)) {
                sum += getPosition(secondLetter);
            } else {
                sum -= getPosition(secondLetter);
            }

        }
        System.out.printf("%.2f", sum);

    }

    private static int getPosition(char firstLetter) {
        return Character.toLowerCase(firstLetter) - 96;
    }
}
