package _01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercise;

import java.util.Scanner;

public class _01_SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int great;

        if (first > second){
            great = first;
            first = second;
            second = great;
        }

        if (first > third) {
            great = first;
            first = third;
            third = great;
        }

        if (second > third){
            great = second;
            second = third;
            third = great;
        }

        System.out.println(third);
        System.out.println(second);
        System.out.println(first);
    }
}
