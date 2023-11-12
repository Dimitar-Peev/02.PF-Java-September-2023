package _10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _05_MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());
   
        StringBuilder bigNumberResult = new StringBuilder();
      
        int remainder = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(number.charAt(i)));
            int product = digit * multiplier + remainder;
          
            if (i == 0) {
                bigNumberResult.insert(0, product);
            } else {
                int digitToAdd = product % 10;
                remainder = product / 10;
                bigNumberResult.insert(0, digitToAdd);
            }
        }
 
        while (bigNumberResult.charAt(0) == '0' && bigNumberResult.length() > 1) {
            bigNumberResult.deleteCharAt(0);
        }
      
        System.out.println(bigNumberResult);
    }
}