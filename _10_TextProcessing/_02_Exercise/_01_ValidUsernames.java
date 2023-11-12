package _10_TextProcessing._02_Exercise;

import java.util.Scanner;

public class _01_ValidUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] usernamesArray = scanner.nextLine().split(", ");

        for (String username : usernamesArray) {
            if (isValidUsername(username)) {
                System.out.println(username);
            }
        }
    }

    static boolean isValidUsername(String username) {
        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        for (int index = 0; index < username.length(); index++) {
            char currentSymbol = username.charAt(index);
            if (!Character.isLetterOrDigit(currentSymbol) && currentSymbol != '-' && currentSymbol != '_') {
                return false;
            }
        }
        return true;
    }
}
