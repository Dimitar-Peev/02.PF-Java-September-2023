package _01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _04_PrintAndSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine()); 
        int endNumber = Integer.parseInt(scanner.nextLine()); 

        int sum = 0;

        while (startNumber <= endNumber) {
            System.out.print(startNumber + " ");
            sum += startNumber;
            startNumber += 1;

        }

        System.out.printf("%nSum: " + sum);

    }
}
