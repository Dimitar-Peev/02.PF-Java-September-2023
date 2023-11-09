package _04_Methods._02_Exercise;

import java.util.Scanner;

public class _08_FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long factFirstNumber = calculateFactorial(firstNumber);

        long factSecondNumber = calculateFactorial(secondNumber);

        double result = factFirstNumber * 1.0 / factSecondNumber;
        System.out.printf("%.2f", result);
    }

    public static long calculateFactorial (int number) {
        long fact = 1; 
		
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        return fact;
    }
}
