package _03_Arrays._02_Exercise;

import java.util.Scanner;

public class _04_ArrayRotation {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
		
        String[] array = scanner.nextLine().split(" "); 
        int countRotation = Integer.parseInt(scanner.nextLine());

        for (int rotation = 1; rotation <= countRotation; rotation++) {
            String firstElement = array[0]; 

            for (int index = 0; index < array.length - 1; index++) {
                array[index] = array[index + 1];
            }

            array[array.length - 1] = firstElement;
        }

        System.out.println(String.join(" ", array)); 
    }
}

