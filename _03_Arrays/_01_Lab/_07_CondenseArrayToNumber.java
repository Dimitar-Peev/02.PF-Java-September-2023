package _03_Arrays._01_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class _07_CondenseArrayToNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

        int[] condensedArr = new int[numbersArr.length - 1];
		
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr.length == 1) {
                break;
            }

            if (i == numbersArr.length - 1) {
                int[] condensedNewArr = new int[condensedArr.length - 1];
                i = -1;

                numbersArr = condensedArr;
                condensedArr = condensedNewArr;
            } else {
                condensedArr[i] = numbersArr[i] + numbersArr[i + 1];
            }
        }

        System.out.println(numbersArr[0]);
    }
}
