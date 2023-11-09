package _03_Arrays._02_Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class _05_TopIntegers {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int [] numbers = new int[input.length];
		
        for (int i = 0; i < input.length; i++) {
            numbers[i]=Integer.parseInt(input[i]);
        }

        for (int index = 0; index < numbers.length - 1; index++) {
            boolean isBigger = true;
            int currentNumber = numbers[index];

            for (int i = index + 1; i < numbers.length; i++) {
                int numberAfter = numbers[i];

                if (currentNumber <= numberAfter) {
                    isBigger = false;
                    break;
                }
            }

            if (isBigger) {
                System.out.print(currentNumber + " ");
            }

        }

        System.out.print(numbers[numbers.length - 1]);

    }
}
