package _10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _04_CaesarCipher {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            letter += 3;

            output.append(letter);
        }

        System.out.println(output.toString());

    }
}
