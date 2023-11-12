package _10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _06_ReplaceRepeatingChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder letters = new StringBuilder(scanner.nextLine());

        for (int i = 0; i < letters.length() - 1; i++) {
            char currentDigit = letters.charAt(i);
            char nextDigit = letters.charAt(i + 1);
            if (currentDigit == nextDigit) {
                letters.deleteCharAt(i);
                i--;
            }
        }
		
        System.out.println(letters);
    }
}
