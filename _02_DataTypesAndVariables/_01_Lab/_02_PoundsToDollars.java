package _02_DataTypesAndVariables._01_Lab;

import java.util.Scanner;

public class _02_PoundsToDollars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float pounds = Float.parseFloat(scanner.nextLine());

        float dollars = pounds * 1.36f;

        String result = String.format("%.3f",dollars);
        System.out.println(result);

    }
}
