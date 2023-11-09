package _01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _11_RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countLoseGames = Integer.parseInt(scanner.nextLine()); 
        double priceHeadset = Double.parseDouble(scanner.nextLine()); 
        double priceMouse = Double.parseDouble(scanner.nextLine()); 
        double priceKeyboard = Double.parseDouble(scanner.nextLine()); 
        double priceDisplay = Double.parseDouble(scanner.nextLine()); 

        int countHeadset = countLoseGames / 2; 
        int countMouse = countLoseGames / 3; 
        int countKeyboard = countLoseGames / 6; 
        int countDisplay = countLoseGames / 12; 

        double totalPrice = (countHeadset * priceHeadset)
                + (countMouse * priceMouse)
                + (countKeyboard * priceKeyboard)
                + (countDisplay * priceDisplay);

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
