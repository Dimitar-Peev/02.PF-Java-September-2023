package _03_Arrays._02_Exercise;

import java.util.Scanner;

public class _01_Train {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int sumPeople = 0;

        for (int i = 0; i < wagons; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            System.out.print(people + " ");
            sumPeople += people;
        }

        System.out.println("\n" + sumPeople);
    }
}
