package _05_List._01_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String input = scanner.nextLine();

        List<Integer> numbersList = Arrays.stream(input.split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int size = numbersList.size();
        for (int i = 0; i < size / 2; i++) {
            int firstNum = numbersList.get(i);
            int secondNum = numbersList.get(numbersList.size() - 1);

            int sum = firstNum + secondNum;
            numbersList.set(i, sum);
            numbersList.remove(numbersList.size() - 1);
        }

        for (int item : numbersList) {
            System.out.print(item + " ");
        }
    }
}
