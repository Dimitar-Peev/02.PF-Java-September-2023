package _10_TextProcessing._03_MoreExercise;

import java.util.Scanner;

public class _02_ASCII_Sumator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char startSymbol = scanner.nextLine().charAt(0);
        char endSymbol = scanner.nextLine().charAt(0);
        String randomString = scanner.nextLine();

        int result = 0;

        for (int i = 0; i < randomString.length(); i++) {
            char letter = randomString.charAt(i);

            if (letter > startSymbol && letter < endSymbol) {
                result += letter;
            }
        }

        System.out.println(result);

    }
}
