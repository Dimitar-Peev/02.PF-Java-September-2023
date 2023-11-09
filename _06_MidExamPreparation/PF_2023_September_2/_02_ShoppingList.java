package _06_MidExamPreparation.PF_2023_September_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ShoppingList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        List<String> productsList = Arrays.stream(scanner.nextLine() 
                        .split("!"))  
                .collect(Collectors.toList()); 

        String command = scanner.nextLine(); 
        while (!command.equals("Go Shopping!")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0]; 
            String product = commandParts[1];

            switch (commandName) {
                case "Urgent":
                    if (!productsList.contains(product)) {
                        productsList.add(0, product); 
                    }
                    break;
                case "Unnecessary":
                    if (productsList.contains(product)) {
                        productsList.remove(product);
                    }
                    break;
                case "Correct":
                    String newProduct = commandParts[2];
                    if (productsList.contains(product)) {
                        int indexProduct = productsList.indexOf(product);
                        productsList.remove(product);
                        productsList.add(indexProduct, newProduct);
                    }
                    break;
                case "Rearrange":
                    if (productsList.contains(product)) {
                        productsList.remove(product);
                        productsList.add(product); 
                    }
                    break;
            }


            command = scanner.nextLine();
        }

        System.out.println(productsList.toString() 
                .replace("[", "")   
                .replace("]", ""));  

    }
}
