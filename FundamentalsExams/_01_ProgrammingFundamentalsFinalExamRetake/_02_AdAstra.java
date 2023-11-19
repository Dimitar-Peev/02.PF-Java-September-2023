package FundamentalsExams._01_ProgrammingFundamentalsFinalExamRetake;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_AdAstra {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "([|#]{1,2})(?<name>[A-Za-z\\s]+)\\1(?<date>[\\d]{2}[/][\\d]{2}[/][\\d]{2})\\1(?<calories>\\d+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher calories = pattern.matcher(input);
        Matcher foodInformation = pattern.matcher(input);

        int totalCalories = 0;
        while (calories.find()) {
            totalCalories += Integer.parseInt(calories.group("calories"));
        }

        System.out.println("You have food to last you for: " + totalCalories / 2000 + " days!");

        while (foodInformation.find()) {
            System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",
                    foodInformation.group("name"),
                    foodInformation.group("date"),
                    foodInformation.group("calories"));
        }

    }
}
