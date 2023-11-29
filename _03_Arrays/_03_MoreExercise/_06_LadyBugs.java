package _03_Arrays._03_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _06_LadyBugs {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] indexesOfLadybugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] field = new int[fieldSize];

        for (int i = 0; i < indexesOfLadybugs.length; i++) {
            int index = indexesOfLadybugs[i];
            if (index >= 0 && index < field.length) {
                field[index] = 1;
            }

        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] data = command.split(" ");
            int index = Integer.parseInt(data[0]);
            String direction = data[1];
            int flyLength = Integer.parseInt(data[2]);

            if (index < 0 || index >= field.length || field[index] != 1) {
                command = scanner.nextLine();
                continue;
            }

            field[index] = 0;

            switch (direction) {
                case "right":
                    index += flyLength;
					
                    while (index < fieldSize && field[index] == 1) {
                        index += flyLength;
                    }
					
                    if (index < fieldSize) {
                        field[index] = 1;
                    }
                    break;
                case "left":
                    index -= flyLength;
  
                    while (index >= 0 && field[index] == 1) {
                        index -= flyLength;
                    }

                    if (index >= 0) {
                        field[index] = 1;
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int element : field) {
            System.out.printf("%d ", element);
        }

    }
}
