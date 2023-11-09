package _02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _04_SumOfChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countSymbols = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int symbol = 1; symbol <= countSymbols; symbol++) {
            sum += scanner.nextLine().charAt(0);
        }

        System.out.printf("The sum equals: %d", sum);
    }
}
