package _03_Arrays._03_MoreExercise;

import java.util.Scanner;

public class _03_RecursiveFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];
        if (n >= 2) {
            numbers[0] = 1;
            numbers[1] = 1;
            for (int i = 2; i < numbers.length; i++) {
                numbers[i] = numbers[i - 1] + numbers[i - 2];
            }
            System.out.println(numbers[n - 1]);
        } else {
            System.out.println(n);
        }
    }
}
