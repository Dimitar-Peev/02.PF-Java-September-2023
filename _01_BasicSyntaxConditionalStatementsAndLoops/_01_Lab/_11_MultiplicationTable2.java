package _01_BasicSyntaxConditionalStatementsAndLoops._01_Lab;

import java.util.Scanner;

public class _11_MultiplicationTable2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());

        if (number2 > 10) {
            System.out.printf("%d X %d = %d\n", number1, number2, number1 * number2);
        } else {
            for (int i = number2; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", number1, i, number1 * i);
            }
        }

    }
}
