package _02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _05_PrintPartOfASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startCode = Integer.parseInt(scanner.nextLine());
        int endCode = Integer.parseInt(scanner.nextLine());

        for (int code = startCode; code <= endCode; code++) {
            System.out.printf("%c ", code);
        }

    }
}
