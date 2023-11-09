package FundamentalsExams._02_ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class _02_ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] intsAsStrings = scanner.nextLine().split(" ");
        int[] numbers = new int [intsAsStrings.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(intsAsStrings[i]);
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandArr = command.split(" ");
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                swap(numbers, index1, index2);

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(commandArr[1]);
                int index2 = Integer.parseInt(commandArr[2]);
                multiply(numbers, index1, index2);

            } else if (command.contains("decrease")) {
                for (int i = 0; i < numbers.length; i++) {
                    numbers[i] = numbers[i] - 1;
                }

            }
            command = scanner.nextLine();
        }

        printArray(numbers, ", ");
    }


    public static int[] multiply(int[] arr, int index1, int index2) {
        int first = arr[index1] * arr[index2];
        arr[index1] = first;
        return arr;
    }

    public static int[] swap(int[] arr, int index1, int index2) {

        int firstNum = arr[index2];
        int secondNum = arr[index1];
        arr[index1] = firstNum;
        arr[index2] = secondNum;
        return arr;
    }

    public static void printArray(int[] array, String separator) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
}