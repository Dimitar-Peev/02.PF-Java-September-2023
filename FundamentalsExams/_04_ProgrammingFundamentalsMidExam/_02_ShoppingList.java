package FundamentalsExams._04_ProgrammingFundamentalsMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _02_ShoppingList {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        List<String> productList = Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Go Shopping!")) {
            String[] commandsArr = inputLine.split(" ");
            String command = commandsArr[0];

            String item = commandsArr[1];
            switch (command) {
                case "Urgent":
                    if (!productList.contains(item)) {
                        productList.add(0, item);
                    }
                    break;
					
                case "Unnecessary":
                    productList.remove(item);
                    break;
					
                case "Correct":
                    String newItem = commandsArr[2];
                    if (productList.contains(item)) {
                        int index = productList.indexOf(item);
                        productList.set(index, newItem);
                    }
                    break;
					
                case "Rearrange":
                    if (productList.contains(item)) {
                        productList.remove(item);
                        productList.add(item);
                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }

        System.out.println(String.join(", ", productList));
    }
}
