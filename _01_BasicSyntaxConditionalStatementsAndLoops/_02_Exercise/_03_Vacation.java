package _01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _03_Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;

        switch (type){
            case "Students":
                if (day.equals("Friday")){
                    price = 8.45;
                } else if (day.equals("Saturday")){
                    price = 9.80;
                } else if (day.equals("Sunday")) {
                    price = 10.46;
                }
                if (numberOfPeople >= 30){
                    price *= .85;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    price = 10.90;
                } else if (day.equals("Saturday")){
                    price = 15.60;
                } else if (day.equals("Sunday")) {
                    price = 16.00;
                }
                if (numberOfPeople >= 100){
                    numberOfPeople -= 10;
                }
                break;
            case "Regular":
                if (day.equals("Friday")){
                    price = 15.00;
                } else if (day.equals("Saturday")){
                    price = 20.00;
                } else if (day.equals("Sunday")) {
                    price = 22.50;
                }
                if (numberOfPeople >= 10 && numberOfPeople <= 20){
                    price *= 0.95;
                }
                break;
        }

        System.out.printf("Total price: %.2f", price * numberOfPeople);
    }
}
