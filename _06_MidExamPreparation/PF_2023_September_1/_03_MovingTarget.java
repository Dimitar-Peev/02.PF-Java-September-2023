package _06_MidExamPreparation.PF_2023_September_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _03_MovingTarget {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> targets = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")) {
                break;
            }

            String[] commandArgs = line.split(" ");
            String command = commandArgs[0];
            int index = Integer.parseInt(commandArgs[1]);

            switch (command) {
                case "Shoot":
                    int power = Integer.parseInt(commandArgs[2]);
                    if (isInside(targets, index)) {
                        targets.set(index, targets.get(index) - power);
                        if (targets.get(index) <= 0) {
                            targets.remove(index);
                        }
                    }
                    break;

                case "Add":
                    int value = Integer.parseInt(commandArgs[2]);
                    if (isInside(targets, index)) {
                        targets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                    int radius = Integer.parseInt(commandArgs[2]);
                    int leftIndex = index - radius;
                    int rightIndex = index + radius;
                    if (isInside(targets, leftIndex) && isInside(targets, rightIndex)) {
                        int count = radius * 2 + 1;
                        for (int i = 0; i < count; i++) {
                            targets.remove(leftIndex);
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
        }


        for (int i = 0; i < targets.size() - 1; i++) {
            System.out.printf("%d|", targets.get(i));
        }
        System.out.printf("%d", targets.get(targets.size() - 1));

    }


    public static boolean isInside(List<Integer> list, int index) {
        return index >= 0 && index < list.size();
    }
}
