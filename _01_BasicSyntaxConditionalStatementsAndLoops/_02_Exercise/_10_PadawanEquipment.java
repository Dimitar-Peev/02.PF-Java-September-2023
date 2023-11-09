package _01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _10_PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceLightSabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());
        int freeBelts = countStudents / 6;

        double totalSum = (priceLightSabers * Math.ceil(countStudents * 1.10)) + (priceRobes * (countStudents)) + (priceBelts * (countStudents - freeBelts));

        if (amountMoney >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - amountMoney);
        }
    }
}
