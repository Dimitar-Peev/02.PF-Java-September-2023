package _01_BasicSyntaxConditionalStatementsAndLoops._01_Lab;

import java.util.Scanner;

public class _04_BackIn30Minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalTimeInSec = (hours * 60) + minutes + 30;
        int returnHours = totalTimeInSec / 60;
        int returnMinutes = totalTimeInSec % 60;

        if (returnHours > 23) {
            returnHours = 0;
            System.out.printf("%d:%02d", returnHours, returnMinutes);
        } else {
            System.out.printf("%d:%02d", returnHours, returnMinutes);
        }


    }
}
