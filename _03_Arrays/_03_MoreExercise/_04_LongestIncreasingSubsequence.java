package _03_Arrays._03_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_LongestIncreasingSubsequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numsArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int maxLength = 0;
        int lastIndex = -1;
        int[] length = new int[numsArray.length];
        int[] previous = new int[numsArray.length];

        for (int i = 0; i < numsArray.length; i++) {
            length[i] = 1;
            previous[i] = -1;

            for (int j = 0; j < i; j++) {
                if (numsArray[j] < numsArray[i] && length[j] + 1 > length[i]) {
                    length[i] = length[j] + 1;
                    previous[i] = j;
                }
            }

            if (length[i] > maxLength) {
                maxLength = length[i];
                lastIndex = i;
            }
        }

        int[] LIS = new int[maxLength];
        int currentIndex = maxLength - 1;

        while (lastIndex != -1) {
            LIS[currentIndex] = numsArray[lastIndex];
            currentIndex--;
            lastIndex = previous[lastIndex];
        }

        for (int nums : LIS) {
            System.out.print(nums + " ");
        }

    }
}
