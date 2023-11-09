package FundamentalsExams._03_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        int wonBattles = 0;
        int lastDistance = 0;

        String input = scanner.nextLine();
        while (!input.equals("End of battle")) {
            int currentDistance = Integer.parseInt(input);

            initialEnergy -= currentDistance;

            if (initialEnergy < 0) {
                lastDistance = currentDistance;
                break;
            }

            wonBattles++;

            if (wonBattles % 3 == 0) {
                initialEnergy += wonBattles;
            }

            input = scanner.nextLine();
        }

        if (initialEnergy < 0) {
            initialEnergy += lastDistance;
            System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wonBattles, initialEnergy);
        } else {
            System.out.printf("Won battles: %d. Energy left: %d", wonBattles, initialEnergy);
        }

        scanner.close();
    }
}
