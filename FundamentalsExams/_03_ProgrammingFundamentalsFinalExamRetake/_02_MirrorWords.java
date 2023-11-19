package FundamentalsExams._03_ProgrammingFundamentalsFinalExamRetake;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MirrorWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([@]|[#])(?<wordOne>[A-Za-z]{3,})\\1\\1(?<wordTwo>[A-Za-z]{3,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int countWordPairs = 0;
        Map<String, String> wordsMap = new LinkedHashMap<>();

        while (matcher.find()) {
            countWordPairs ++;
            String wordOne = matcher.group("wordOne");
            String wordTwo = matcher.group("wordTwo");
            StringBuilder wordOneRev = new StringBuilder(wordOne).reverse();

            if (wordOneRev.toString().equals(wordTwo)) {
                wordsMap.put(wordOne, wordTwo);
            }
        }

        if (countWordPairs == 0) {
            System.out.println("No word pairs found!");
        } else {
            System.out.println(countWordPairs + " word pairs found!");
        }

        if (wordsMap.isEmpty()) {
            System.out.println("No mirror words!");
        } else {
            System.out.println("The mirror words are:");

            StringBuilder finalWord = new StringBuilder();

            for (Map.Entry<String, String> entry : wordsMap.entrySet()) {
                finalWord.append(String.format("%s <=> %s, ", entry.getKey(), entry.getValue()));
            }

            finalWord.delete(finalWord.length() - 2, finalWord.length());

            System.out.println(finalWord);
        }
    }
}