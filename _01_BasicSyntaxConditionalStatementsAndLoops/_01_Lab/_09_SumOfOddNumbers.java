package _01_BasicSyntaxConditionalStatementsAndLoops._01_Lab;

import java.util.Scanner;

public class _09_SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int result = 0;
        for (int i = 1; i <= number * 2; i += 2) {
            System.out.println(i);
            result+=i;
        }

        System.out.println("Sum: " + result);
    }
}
