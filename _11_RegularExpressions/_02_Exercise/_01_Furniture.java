package _11_RegularExpressions._02_Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = ">>(?<furnitureName>[\\w]+)<<(?<price>[\\d.]+)!(?<quantity>[\\d]+)"; 
        Pattern pattern = Pattern.compile(regex); 
        ArrayList<String> furniture = new ArrayList<>(); 
        double totalPrice = 0; 

        String input = scanner.nextLine(); 

        while (!input.equals("Purchase")) {

            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String furnitureName = matcher.group("furnitureName"); 
                double price = Double.parseDouble(matcher.group("price")); 
                int quantity = Integer.parseInt(matcher.group("quantity")); 

                furniture.add(furnitureName);
                double currentPrice = price * quantity; 
                totalPrice += currentPrice;
            }
            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}