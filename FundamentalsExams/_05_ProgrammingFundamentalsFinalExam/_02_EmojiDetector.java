package FundamentalsExams._05_ProgrammingFundamentalsFinalExam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_EmojiDetector {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String regex = "([:]{2}|[*]{2})(?<emoji>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        int coolThreshold = 1;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol)) {
                coolThreshold *= Integer.parseInt(Character.toString(symbol));
            }
        }
        System.out.printf("Cool threshold: %d%n", coolThreshold);

        int countValidEmoji = 0;
		
        ArrayList<String> coolEmoji = new ArrayList<>();

        while(matcher.find()) {
            countValidEmoji++;
            String emoji = matcher.group("emoji");

            int emojiSum = 0;
            for (char symbol : emoji.toCharArray()) {
                emojiSum += symbol;
            }

            if (emojiSum >= coolThreshold) {
                coolEmoji.add(matcher.group());
            }
        }

        System.out.printf("%d emojis found in the text. The cool ones are:%n", countValidEmoji);
        coolEmoji.forEach(emoji -> System.out.println(emoji));
    }
}
