package _09_AssociativeArrays._02_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _01_CountCharInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceAll(" ", "");

        Map<Character, Integer> symbolsCount = new LinkedHashMap<>();

        for (char symbol : input.toCharArray()) {
            symbolsCount.putIfAbsent(symbol, 0);
            symbolsCount.put(symbol, symbolsCount.get(symbol) + 1);
        }

        for (Character i : symbolsCount.keySet()) {
            System.out.println(i + " -> " + symbolsCount.get(i));

        }
    }
}
