package _05_List._03_MoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_TakeSkipRope {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Character> text = Arrays.stream(scan.nextLine().split("")).map(a -> a.charAt(0)).collect(Collectors.toList());

        ArrayList<String> nonNumbers = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();

        text.forEach(character -> {
            if (Character.isDigit(character)) {
                numbers.add(Integer.parseInt(String.valueOf(character)));
            } else {
                nonNumbers.add(String.valueOf(character));
            }
        });

        System.out.println(decryptMessage(numbers, nonNumbers));
    }

    private static StringBuilder decryptMessage(ArrayList<Integer> numbers, ArrayList<String> nonNumbers) {
        StringBuilder decryptedMessage = new StringBuilder();
        int count = 0;

        for (int i = 0; i < numbers.size(); i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numbers.get(i); j++) {
                    if (count != nonNumbers.size()) {
                        decryptedMessage.append(nonNumbers.get(count));
                        count++;
                    }
                }
            } else {
                count += numbers.get(i);
            }
        }
        return decryptedMessage;
    }
}
