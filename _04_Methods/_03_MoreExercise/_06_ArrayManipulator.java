package _04_Methods._03_MoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class _06_ArrayManipulator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
        int[] inputArr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
				
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] data = inputLine.split(" ");
            String command = data[0];
            int count = 0;

            switch (command) {
                case "exchange":
                    int index = Integer.parseInt(data[1]);
                    if (isValidIndex(index, inputArr.length)) {
                        exchange(inputArr, index);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "max":
                    if (data[1].equals("even")) {
                        printEvenMax(inputArr);
                    } else {
                        printOddMax(inputArr);
                    }
                    break;
                case "min":
                    if (data[1].equals("even")) {
                        printEvenMin(inputArr);
                    } else {
                        printOddMin(inputArr);
                    }
                    break;
                case "first":
                    count = Integer.parseInt(data[1]);
                    if (count > inputArr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (data[2].equals("even")) {
                            printFirstEven(inputArr, count);
                        } else {
                            printFirstOdd(inputArr, count);
                        }
                    }

                    break;
                case "last":
                    count = Integer.parseInt(data[1]);
                    if (count > inputArr.length) {
                        System.out.println("Invalid count");
                    } else {
                        if (data[2].equals("even")) {
                            printLastEven(inputArr, count);
                        } else {
                            printLastOdd(inputArr, count);
                        }
                    }
            }

            inputLine = scanner.nextLine();
        }
        System.out.println(Arrays.toString(inputArr));
    }

    public static boolean isValidIndex(int index, int length) {
        return index >= 0 && index < length;
    }

    public static void exchange(int[] array, int index) {
        int[] first = new int[index + 1];
        int[] second = new int[array.length - index - 1];

        for (int i = 0; i <= index; i++) {
            first[i] = array[i];
        }

        for (int i = 0; i < second.length; i++) {
            second[i] = array[index + 1 + i];
        }

        for (int i = 0; i < array.length; i++) {
            if (i < second.length) {
                array[i] = second[i];
            } else {
                array[i] = first[i - second.length];
            }
        }
    }

    public static void printEvenMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i] && array[i] % 2 == 0) {
                minNumber = array[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printOddMin(int[] array) {
        int minNumber = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (minNumber >= array[i] && array[i] % 2 != 0) {
                minNumber = array[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printEvenMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i] && array[i] % 2 == 0) {
                maxNumber = array[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printOddMax(int[] array) {
        int maxNumber = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i] && array[i] % 2 != 0) {
                maxNumber = array[i];
                index = i;
            }
        }

        if (index == -1) {
            System.out.println("No matches");
        } else {
            System.out.println(index);
        }
    }

    public static void printFirstEven(int[] array, int count) {
        int[] bufferArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        printArr(bufferArr);
    }

    public static void printFirstOdd(int[] array, int count) {
        int[] bufferArr = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        printArr(bufferArr);
    }

    public static void printLastEven(int[] array, int count) {
        int[] bufferArr = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        printArr(bufferArr);
    }

    public static void printLastOdd(int[] array, int count) {
        int[] bufferArr = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 != 0 && count > 0) {
                bufferArr[i] = array[i];
                count--;
            } else {
                bufferArr[i] = -1;
            }
        }
        printArr(bufferArr);
    }

    private static void printArr(int[] array) {
        System.out.print("[");
        boolean printFirst = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != -1) {
                if (printFirst) {

                    System.out.print(array[i]);
                    printFirst = false;
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        }
        System.out.println("]");
    }
}
