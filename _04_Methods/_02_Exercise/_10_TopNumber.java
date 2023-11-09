package _04_Methods._02_Exercise;

import java.util.Scanner;

public class _10_TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 8; number <= n; number++) {
            boolean isValidSumDigits = checkSumDigitsIsDivisibleBy8(number);
			
            if (isValidSumDigits) {
                boolean isContainsOddDigit = checkContainsOddDigit(number);
                if (isContainsOddDigit) {
                    //топ число
                    System.out.println(number);
                }
            }
        }
    }

    public static boolean checkSumDigitsIsDivisibleBy8 (int num) {
        int sum = 0; 
		
        while (num > 0) {
            int lastDigit = num % 10; 
            sum += lastDigit; 
            num = num / 10; 
        }

        return sum % 8 == 0;
    }

    public static boolean checkContainsOddDigit (int number) {
        while (number > 0) {
            int lastDigit = number % 10; 
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number = number / 10;
            }
        }

        return false;
    }
}
