package _04_Methods._02_Exercise;

import java.util.Scanner;

public class _01_SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(firstNumber, secondNumber, thirdNumber);

    }

    public static void printSmallestNumber(int n1, int n2, int n3) { 
        if (n1 <= n2 && n1 < n3) {
            System.out.println(n1);
        } else if (n2 <= n1 && n2 < n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

    }
}
