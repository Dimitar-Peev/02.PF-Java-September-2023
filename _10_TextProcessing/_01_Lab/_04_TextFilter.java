package _10_TextProcessing._01_Lab;

import java.util.Scanner;

public class _04_TextFilter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] banWordsArr = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String banWord : banWordsArr) {
            String asterisk = repeatString(banWord);
            text = text.replace(banWord, asterisk);
        }

        System.out.println(text);
    }

    public static String repeatString(String banWord) {

        String result = "";
        for (int i = 0; i < banWord.length(); i++) {
            result = result + "*";
        }

        return result;
    }
}
