package _01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercise;

import java.util.Scanner;

public class _04_ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String reversedText = "";
        int textLength = text.length();

        while (textLength > 0) {
            reversedText += text.charAt(textLength - 1);
            textLength--;
        }

        System.out.println(reversedText);
    }
}
