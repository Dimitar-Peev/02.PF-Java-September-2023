package _01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _09_Orders {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int orders = Integer.parseInt(scanner.nextLine());

        double sum = 0;

        for (int i = 1; i <= orders; i++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());
            double currentPrice = (days * capsulesCount) * pricePerCapsule;
            System.out.printf("The price for the coffee is: $%.2f%n", currentPrice);
            sum = sum + currentPrice;
        }

        System.out.printf("Total: $%.2f", sum);
    }
}
