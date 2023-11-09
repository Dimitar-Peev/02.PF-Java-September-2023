package _02_DataTypesAndVariables._01_Lab;

import java.util.Scanner;

public class _08_LowerOrUpper {
    public static void main(String[] args) {

        // Вероника Ванева - май 2023
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.nextLine().charAt(0); // превръщаме char в int

        if (Character.isUpperCase(symbol)) {
            System.out.println("upper-case");
        } else if (Character.isLowerCase(symbol)) {
            System.out.println("lower-case");
        }

//        if (symbol >= 'A' && symbol <= 'Z') {
//            System.out.println("upper-case");
//        } else if (symbol >= 'a' && symbol <= 'z') {
//            System.out.println("lower-case");
//        }

/*
        boolean upperCase = number >= 65 && number <= 90;
        boolean lowerCase = number >= 97 && number <= 122;

        if (upperCase) {
            System.out.println("upper-case");
        } else if (lowerCase) {
            System.out.println("lower-case");
        }

*/

    }
}
