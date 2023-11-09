package _10_TextProcessing._01_Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class _02_RepeatStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");

        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];

            String repeatWord = repeatString(currentWord);

            resultList.add(repeatWord);
        }

        System.out.println(String.join("", resultList));

    }

    public static String repeatString(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            result += word;
        }

        return result;
    }
}
