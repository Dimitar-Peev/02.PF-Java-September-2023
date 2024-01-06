package _03_Arrays._03_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _04_LongestIncreasingSubsequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numsArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int[] lisLength = new int[numsArray.length];
        int[] lisPrevious = new int[numsArray.length];

        for (int i = 0; i < lisLength.length; i++) {
            lisLength[i] = 1;
            lisPrevious[i] = -1;
        }

        for (int currentIndex = 0; currentIndex < numsArray.length; currentIndex++) {
            for (int prevIndex = 0; prevIndex < currentIndex; prevIndex++) {
                if (numsArray[prevIndex] < numsArray[currentIndex]) {
                    int newLength = lisLength[prevIndex] + 1;
                    if (newLength > lisLength[currentIndex]) {
                        lisLength[currentIndex] = newLength;
                        lisPrevious[currentIndex] = prevIndex;
                    }
                }
            }
        }

        int maxLength = 0;
        int maxLengthIndex = -1;
        for (int i = 0; i < lisLength.length; i++) {
            if (lisLength[i] > maxLength) {
                maxLength = lisLength[i];
                maxLengthIndex = i;
            }
        }

        int index = maxLengthIndex;
        int[] lis = new int[maxLength];
        int pos = 0;
        while (index != -1) {
            lis[pos++] = numsArray[index];
            index = lisPrevious[index];
        }

        for (int i = lis.length - 1; i >= 0; i--) {
            System.out.print(lis[i] + " ");
        }

    }
}
