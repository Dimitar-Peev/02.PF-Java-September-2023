package FundamentalsExams._01_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MemoryGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> sequenceOfElements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        int counter = 0;

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            counter++;
            int[] inputArray = Arrays.stream(input.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();

            int firstIndex = inputArray[0];
            int secondIndex = inputArray[1];

            if (userIsCheating(firstIndex, secondIndex, sequenceOfElements)) {
                System.out.println("Invalid input! Adding additional elements to the board");

                String penaltyNumber = String.format("-%da", counter);
                sequenceOfElements.add(sequenceOfElements.size() / 2, penaltyNumber);
                sequenceOfElements.add(sequenceOfElements.size() / 2, penaltyNumber);
                input = scanner.nextLine();
                continue;
            }

            String firstNumber = sequenceOfElements.get(firstIndex);
            String secondNumber = sequenceOfElements.get(secondIndex);

            if (firstNumber.equals(secondNumber)) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", firstNumber);
                sequenceOfElements.remove(firstNumber);
                sequenceOfElements.remove(secondNumber);
            } else {
                System.out.println("Try again!");
            }

            if (sequenceOfElements.isEmpty()) {
                break;
            }

            input = scanner.nextLine();
        }

        if (sequenceOfElements.isEmpty()) {
            System.out.printf("You have won in %d turns!", counter);
        } else {
            System.out.println("Sorry you lose :(");
            System.out.println(String.join(" ", sequenceOfElements));
        }
    }

    public static boolean userIsCheating(int firtsIndex, int secondIndex, List<String> sequenceOfElements) {
        if (firtsIndex == secondIndex) {
            return true;
        }

        if (firtsIndex < 0 || firtsIndex >= sequenceOfElements.size()) {
            return true;
        }

        if (secondIndex < 0 || secondIndex >= sequenceOfElements.size()) {
            return true;
        }


        return false;
    }
}
