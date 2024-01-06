package _10_TextProcessing._03_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _03_TreasureFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] keys = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();

        while (!"find".equals(input)) {
            StringBuilder text = new StringBuilder();
            int keyCounter = 0;
            for (int i = 0; i < input.length(); i++) {
                text.append((char) (input.charAt(i) - keys[keyCounter]));
                keyCounter++;
                if (keyCounter > keys.length - 1) {
                    keyCounter = 0;
                }
            }
            String treasure = text.substring(text.indexOf("&") + 1, text.lastIndexOf("&"));
            String coordinates = text.substring(text.indexOf("<") + 1, text.indexOf(">"));

            System.out.printf("Found %s at %s%n", treasure, coordinates);
            input = scanner.nextLine();
        }

    }
}
