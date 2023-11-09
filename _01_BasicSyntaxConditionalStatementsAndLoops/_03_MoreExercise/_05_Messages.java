package _01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercise;

import java.util.Scanner;

public class _05_Messages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countLetters = Integer.parseInt(scanner.nextLine()); 

        for (int i = 1; i <= countLetters; i++) {
            int inputNumbers = Integer.parseInt(scanner.nextLine());
            String numberAsText = Integer.toString(inputNumbers); 
            int digitsCount = numberAsText.length(); 
            int mainDigit = inputNumbers % 10; 
            int offset = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                offset++;
            }

            int letterIndex = offset + digitsCount - 1;

            if (inputNumbers == 0) {
                System.out.print(" ");
            } else {
                int letter = letterIndex + 97;
                System.out.print((char)letter);
            }

        }
    }
}
