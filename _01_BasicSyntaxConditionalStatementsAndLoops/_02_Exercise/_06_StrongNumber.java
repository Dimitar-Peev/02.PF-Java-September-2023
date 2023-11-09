package _01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _06_StrongNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int numberForCompare = number;

        String numberString = number + "";
        int aloneNum = 0;

        int sumFactoriel = 0;

        for (int i = 0; i < numberString.length(); i++) {
            int firstResult = 1;
            aloneNum = number % 10;
            number /= 10;
            for (int j = aloneNum; j > 0 ; j--) {
                firstResult = firstResult * j;
            }

            sumFactoriel += firstResult;
        }


        if (sumFactoriel == numberForCompare) { 
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
