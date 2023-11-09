package _02_DataTypesAndVariables._03_MoreExercise;

import java.util.Scanner;

public class _02_FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            long num1 = Long.parseLong(scanner.next());
            long num2 = Long.parseLong(scanner.next());

            int sumOfNumbers = 0;
            if (num1 > num2) {
                long numFirst = Math.abs(num1);
                while (numFirst > 0) {
                    sumOfNumbers += (numFirst % 10);
                    numFirst /= 10;
                }
            } else {
                long numSecond = Math.abs(num2);
                while (numSecond > 0) {
                    sumOfNumbers += (numSecond % 10);
                    numSecond /= 10;
                }
            }
            System.out.println(sumOfNumbers);

        }
    }
}
