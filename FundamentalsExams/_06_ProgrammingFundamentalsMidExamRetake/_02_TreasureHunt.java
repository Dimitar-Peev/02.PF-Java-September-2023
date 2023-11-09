package FundamentalsExams._06_ProgrammingFundamentalsMidExamRetake;

import java.util.Arrays;
import java.util.Scanner;

public class _02_TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] treasures = input.split("\\|");

        String command;
        while (!"Yohoho!".equals(command = scanner.nextLine())) {
            String[] treasureInput = command.split(" ");
            String treasureCommand = treasureInput[0];

            if ("Loot".equals(treasureCommand)) {
                for (int i = 1; i < treasureInput.length; i++) {
                    boolean isItemExisting = false;

                    for (String treasure : treasures) {
                        if (treasureInput[i].equals(treasure)) {
                            isItemExisting = true;
                            break;
                        }
                    }

                    if (!isItemExisting) {
                        String[] treasuresNew = new String[treasures.length + 1];
                        treasuresNew[0] = treasureInput[i];
                        System.arraycopy(treasures, 0, treasuresNew, 1, treasures.length);
                        treasures = treasuresNew;
                    }
                }
            } else if ("Drop".equals(treasureCommand)) {
                int index = Integer.parseInt(treasureInput[1]);

                if (index >= 0 && index <= treasures.length - 1) {
                    String droppedLoot = treasures[index];

                    for (int i = index; i < treasures.length - 1; i++) {
                        treasures[i] = treasures[i + 1];
                    }

                    treasures[treasures.length - 1] = droppedLoot;
                }
            } else if ("Steal".equals(treasureCommand)) {
                int items = Integer.parseInt(treasureInput[1]);
                int itemsToDrop = Math.min(items, treasures.length);
                if (itemsToDrop > 0) {
                    String[] stolenTreasures = Arrays.copyOfRange(treasures, treasures.length - itemsToDrop, treasures.length);
                    treasures = Arrays.copyOf(treasures, treasures.length - itemsToDrop);
                    System.out.println(String.join(", ", stolenTreasures));
                }
            }
        }

        if (treasures.length > 0) {
            int sumItems = 0;
            for (String treasure : treasures) {
                sumItems += treasure.length();
            }

            double avgTreasureGain = (double) sumItems / treasures.length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", avgTreasureGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }
    }
}
