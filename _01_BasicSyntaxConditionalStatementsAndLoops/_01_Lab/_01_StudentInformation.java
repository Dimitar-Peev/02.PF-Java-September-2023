package _01_BasicSyntaxConditionalStatementsAndLoops._01_Lab;

import java.util.Scanner;

public class _01_StudentInformation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double avgGrade = Double.parseDouble(scanner.nextLine());

        String formattedStr = String.format("Name: %s, Age: %d, Grade: %.2f", name, age, avgGrade);

        System.out.println(formattedStr);
    }
}
