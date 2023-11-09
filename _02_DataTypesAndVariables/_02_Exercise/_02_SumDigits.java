package _02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _02_SumDigits_While {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int sum = 0; 

        while (number > 0) { 
           int lastDigit = number % 10;
           sum += lastDigit;
           number /= 10; 
        }

        System.out.println(sum);
    }
}
