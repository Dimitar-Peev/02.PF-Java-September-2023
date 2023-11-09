package _02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _03_Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());
        double capacity = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(countPeople / capacity);
        System.out.printf("%.0f", courses);

    }
}
