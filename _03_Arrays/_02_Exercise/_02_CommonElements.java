package _03_Arrays._02_Exercise;

import java.util.Scanner;

public class _02_CommonElements {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split(" "); 
        String[] secondArray = scanner.nextLine().split(" "); 

        for (String wordsLine2 : secondArray) {
            for (String wordsLine1 : firstArray) {
                if (wordsLine2.equals(wordsLine1)) {
                    System.out.printf("%s ", wordsLine1);
                }
            }
        }
  
    }
}
