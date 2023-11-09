package _04_Methods._03_MoreExercise;

import java.util.Scanner;

public class _05_MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        printMultiplicationSign(firstNumber, secondNumber, thirdNumber);

    }

    public static void printMultiplicationSign(int n1, int n2, int n3){
        if (n1 == 0 || n2 == 0 || n3 == 0) {
            System.out.println("zero");
        } else if ((n1 > 0 && n2 > 0 && n3 > 0)
                || (n1 < 0 && n2 < 0 && n3 > 0)
                || (n1 < 0 && n2 > 0 && n3 < 0)
                || (n1 > 0 && n2 < 0 && n3 < 0)) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }
    }
}
