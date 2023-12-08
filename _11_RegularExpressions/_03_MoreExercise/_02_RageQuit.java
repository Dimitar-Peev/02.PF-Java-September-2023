package _11_RegularExpressions._03_MoreExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_RageQuit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String regex = "(?<char>[^\\d]+)(?<digit>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
      
        StringBuilder sb = new StringBuilder();

        while (matcher.find()) {
            String chars = matcher.group("char");
            int digit = Integer.parseInt(matcher.group("digit"));

            if (digit != 0) {
                for (int i = 0; i < digit; i++) {
                    sb.append(chars.toUpperCase());
                }
            }
        }
		
        System.out.println(String.format("Unique symbols used: %d", sb.chars().distinct().count()));
        System.out.println(sb);
    }
}