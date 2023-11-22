package _11_RegularExpressions._03_MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04_SantasSecretHelper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());

        String nameAndBehavior = "@(?<name>[A-Za-z]+)[^@!:>-]*!(?<behavior>[GN])!";
        Pattern pattern = Pattern.compile(nameAndBehavior);
        Matcher matcher = null;

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            StringBuilder decodedMessage = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                int symbolCode = input.charAt(i);
                symbolCode -= key;
                char newSymbol = (char) symbolCode;
                decodedMessage.append(newSymbol);
            }

            matcher = pattern.matcher(decodedMessage);

            while (matcher.find()) {
                String name = matcher.group("name");
                String behavior = matcher.group("behavior");

                if (behavior.equals("G")) {
                    System.out.println(name);
                }
            }
            input = scanner.nextLine();
        }
    }
}
