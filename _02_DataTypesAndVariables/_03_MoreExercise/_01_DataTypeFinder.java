package _02_DataTypesAndVariables._03_MoreExercise;

import java.util.Scanner;

public class _01_DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String dataType = "";

        while (!input.equals("END")) {
            Scanner type = new Scanner(input);
            if (type.hasNextBoolean()) {
                dataType = "boolean";
            } else if (type.hasNextInt()) {
                dataType = "integer";
            } else if (type.hasNextDouble()) {
                dataType = "floating point";
            } else if (input.length() == 1) {
                dataType = "character";
            } else if (type.hasNextLine()) {
                dataType = "string";
            }

            System.out.printf("%s is %s type\n", input, dataType);

            input = scanner.nextLine();
        }
    }
}
