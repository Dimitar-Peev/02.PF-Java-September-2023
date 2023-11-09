package FundamentalsExams._02_ProgrammingFundamentalsMidExam;

import java.util.*;

public class _03_Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        String[] numberString = scanner.nextLine().split(" ");
        int[] numbersArr = new int[numberString.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numbersArr[i] = Integer.parseInt(numberString[i]);
        }

        double sum = getSum(numbersArr);
        double average = sum / numbersArr.length;

        List<Integer> topNumbers = new ArrayList<>();

        for (int currentNum : numbersArr) {
            if (currentNum > average) {
                topNumbers.add(currentNum);
            }
        }

        Collections.sort(topNumbers);
        Collections.reverse(topNumbers);

        if (topNumbers.size() > 5) {
            for (int i = 0; i < 5; i++) {
                System.out.print(topNumbers.get(i) + " ");
            }
        } else if (topNumbers.isEmpty()) {
            System.out.println("No");
        } else {
            printList(topNumbers, " ");
        }
    }

    private static double getSum(int[] numbersArr) {
        double sum = 0;
        for (int currentNum : numbersArr) {
            sum += currentNum;
        }
        return sum;
    }

    public static void printList(List<Integer> array, String separator) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i));
            if (i < array.size() - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }
}
