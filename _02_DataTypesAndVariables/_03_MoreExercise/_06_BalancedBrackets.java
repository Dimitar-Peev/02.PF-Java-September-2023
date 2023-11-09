package _02_DataTypesAndVariables._03_MoreExercise;

import java.util.Scanner;

public class _06_BalancedBrackets {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());
        int countIn = 0;
        int countOut = 0;

        for (int i = 1; i <= nLines; i++) {
            String input = scanner.nextLine();

            if (input.equals("(")) {
                countIn++;
            } else if (input.equals(")")) {
                countOut++;
                if (countOut - countIn != 0) {
                    break;
                }
            }
        }

        if (countIn == countOut) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }

    }
}
