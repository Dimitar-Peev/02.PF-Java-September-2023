package _03_Arrays._02_Exercise;

import java.util.Scanner;

public class _07_MaxSequenceEqualElements {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
            ;
        }

        int bestNumber = numbers[0];
        int bestCounter = 1;

        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            int currentCount = 1;
			
            for (int g = i + 1; g < numbers.length; g++) {
                int number = numbers[g];

                if (currentNumber == number) {
                    currentCount++;
                    if (currentCount > bestCounter) {
                        bestCounter = currentCount;
                        bestNumber = currentNumber;
                    }
                } else {
                    break;
                }

            }
        }

        for (int i = 0; i < bestCounter; i++) {
            System.out.print(bestNumber + " ");
        }

    }
}
