package _02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _07_WaterOverflow {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int currentLiters = 0;

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            int pouredLiters = Integer.parseInt(scanner.nextLine());
            currentLiters += pouredLiters;

            if(currentLiters > capacity) {
                System.out.println("Insufficient capacity!");
                currentLiters -= pouredLiters;
            }
        }

        System.out.println(currentLiters);
    }
}
