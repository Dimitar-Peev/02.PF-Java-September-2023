package _04_Methods._02_Exercise;

import java.util.Scanner;

public class _02_VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        printCountVowels(text);

    }

    public static void printCountVowels (String text) {
        int count = 0; 

        for (char symbol : text.toCharArray()) {
 
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
