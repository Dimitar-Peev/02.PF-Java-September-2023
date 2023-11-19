package _11_RegularExpressions._03_MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_RageQuit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "(?<word>[\\D]*)(?<times>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        StringBuilder strBuilder = new StringBuilder();
        while (matcher.find()) {
            String word = matcher.group("word").toUpperCase();
            int n = Integer.parseInt(matcher.group("times"));

            for (int i = 0; i < n; i++) {
                strBuilder.append(word);
            }
        }

        System.out.printf("Unique symbols used: %d%n", strBuilder.chars().distinct().count());
        System.out.println(strBuilder);
    }
}
