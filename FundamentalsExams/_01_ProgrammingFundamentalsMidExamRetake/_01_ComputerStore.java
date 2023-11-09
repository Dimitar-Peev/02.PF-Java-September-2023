package FundamentalsExams._01_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_ComputerStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

        double totalPrice = 0;

        while (!type.equals("special")) {
            if (type.equals("regular")) {
                break;
            }

            double partPrice = Double.parseDouble(type);

            if (partPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                totalPrice += partPrice;
            }


            type = scanner.nextLine();
        }


        double taxes = totalPrice * 0.2;
        double priceWithTaxes = totalPrice + taxes;

        if (type.equals("special")) {
            priceWithTaxes *= 0.9;
        }

        if (priceWithTaxes <= 0) {
            System.out.println("Invalid order!");

        } else {
            System.out.printf("Congratulations you've just bought a new computer!\n" +
                    "Price without taxes: %.2f$\n" +
                    "Taxes: %.2f$\n" +
                    "-----------\n" +
                    "Total price: %.2f$\n", totalPrice, taxes, priceWithTaxes);
        }

        scanner.close();
    }
}
