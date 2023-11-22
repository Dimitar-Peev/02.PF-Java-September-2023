package _11_RegularExpressions._02_Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_StarEnigma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Pattern keys = Pattern.compile("[STARstar]");
        Matcher matcherKeys = null;
        Pattern message = Pattern.compile("[^@!:>-]*?@(?<name>[A-Za-z]+)[^@!:>-]*?:(?<population>\\d+)[^@!:>-]*?!(?<attack>[AD])![^@!:>-]*?->(?<soldiers>\\d+)");
        Matcher matcherMessage = null;

        int numberOfMessages = Integer.parseInt(scanner.nextLine());
		
        Map<String, String[]> planets = new TreeMap<>();

        for (int i = 1; i <= numberOfMessages; i++) {
            String cryptoMessage = scanner.nextLine();
            int keysNumber = 0;
            matcherKeys = keys.matcher(cryptoMessage);
            while (matcherKeys.find()) {
                keysNumber++;
            }
            StringBuilder decodedMessage = new StringBuilder();
            for (int j = 0; j < cryptoMessage.length(); j++) {
                decodedMessage.append(Character.toChars(cryptoMessage.charAt(j) - keysNumber));
            }
            matcherMessage = message.matcher(decodedMessage);
            if (matcherMessage.find()) {
                String[] planet = {matcherMessage.group("population"), matcherMessage.group("attack"), matcherMessage.group("soldiers")};
                planets.put(matcherMessage.group("name"), planet);
            }
        }
		
        System.out.printf("Attacked planets: %d%n", countAttackType(planets, "A"));
        printPlanets(planets, "A");
        System.out.printf("Destroyed planets: %d%n", countAttackType(planets, "D"));
        printPlanets(planets, "D");
    }

    private static int countAttackType(Map<String, String[]> planets, String type) {
        int counter = 0;
        for (Map.Entry<String, String[]> entry : planets.entrySet()) {
            if (entry.getValue()[1].equals(type)) {
                counter++;
            }
        }
        return counter;
    }

    private static void printPlanets(Map<String, String[]> planets, String type) {
        for (Map.Entry<String, String[]> entry : planets.entrySet()) {
            if (entry.getValue()[1].equals(type)) {
                System.out.printf("-> %s%n", entry.getKey());
            }
        }
    }
}