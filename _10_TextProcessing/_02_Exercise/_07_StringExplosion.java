package _10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _07_StringExplosion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder inputSB = new StringBuilder(scanner.nextLine());
      
        int strength = 0;
      
        for (int i = 0; i < inputSB.length(); i++) {
            if (strength > 0 && inputSB.charAt(i) != '>') {
                inputSB.deleteCharAt(i);
                strength--;
                i--;
            } else if (inputSB.charAt(i) == '>') {
                strength += Integer.parseInt(String.valueOf(inputSB.charAt(i + 1)));
            }
        }

        System.out.println(inputSB);
    }
}