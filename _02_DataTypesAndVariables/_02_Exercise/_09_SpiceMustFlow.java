package _02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _09_SpiceMustFlow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int daysCount = 0;
        int spicesCollected = 0;

        if (startingYield < 100) {
            System.out.println(daysCount);
            System.out.println(spicesCollected);
        } else {

            while (startingYield >= 100) {
                daysCount++;
                spicesCollected += startingYield - 26;
                startingYield -= 10;
            }
            spicesCollected -= 26;
            System.out.println(daysCount);
            System.out.println(spicesCollected);
        }
    }
}
