package _08_ObjectsAndClasses._01_Lab;

import java.util.*;
import java.util.stream.Collectors;

public class _01_RandomizeWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> words = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Random rdm = new Random();

        while (!words.isEmpty()) {
            String word = words.remove(rdm.nextInt(words.size()));
            System.out.println(word);
        }

    }
}
