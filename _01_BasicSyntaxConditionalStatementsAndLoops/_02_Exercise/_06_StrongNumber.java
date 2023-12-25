package _01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _06_StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumFactorials = 0;

        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - 48;

            int factorial = 1;
            for (int j = 1; j <= digit; j++) {
                factorial = factorial * j;
            }

            sumFactorials += factorial;
        }

        String result = sumFactorials == Integer.parseInt(input) ? "yes" : "no";
        System.out.println(result);

    }
}
