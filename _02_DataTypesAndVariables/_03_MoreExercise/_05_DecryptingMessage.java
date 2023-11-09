package _02_DataTypesAndVariables._03_MoreExercise;

import java.util.Scanner;

public class _05_DecryptingMessage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";

        for (int i = 0; i < n; i++) {
            char letter = scanner.nextLine().charAt(0);
            int correctLetter = key + (int) letter;
            message += (char) correctLetter;
        }

        System.out.println(message);
    }
}
