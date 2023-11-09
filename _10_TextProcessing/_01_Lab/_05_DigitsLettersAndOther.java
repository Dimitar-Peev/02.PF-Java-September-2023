package _10_TextProcessing._01_Lab;

import java.util.Scanner;

public class _05_DigitsLettersAndOther {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();

        StringBuilder digitSb = new StringBuilder();
        StringBuilder letterSb = new StringBuilder();
        StringBuilder otherSb = new StringBuilder();
		
        for (int i = 0; i < inputLine.length(); i++) {
            char symbol = inputLine.charAt(i);

            if (Character.isDigit(symbol)) {
                digitSb.append(symbol);
            } else if (Character.isLetter(symbol)) {
                letterSb.append(symbol);
            } else {
                otherSb.append(symbol);
            }
        }

        System.out.println(digitSb);
        System.out.println(letterSb);
        System.out.println(otherSb);
    }
}
