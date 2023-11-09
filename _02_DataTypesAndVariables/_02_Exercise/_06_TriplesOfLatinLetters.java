package _02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _06_TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (char letter1 = 'a'; letter1 < 'a' + n; letter1++) {
            for (char letter2 = 'a'; letter2 < 'a' + n; letter2++) {
                for (char letter3 = 'a'; letter3 < 'a' + n; letter3++) {
                    System.out.println(String.valueOf(letter1) + letter2 + letter3);
                }
            }
        }


    }
}
