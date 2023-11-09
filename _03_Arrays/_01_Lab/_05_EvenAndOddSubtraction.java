package _03_Arrays._01_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _05_EvenAndOddSubtraction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArray = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int currentNum : numbersArray) {
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }
        }

        int diff = evenSum - oddSum;
        System.out.println(diff);

    }
}
