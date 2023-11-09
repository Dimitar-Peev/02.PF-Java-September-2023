package FundamentalsExams._05_ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class _01_BonusScoringSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        int numberOfLectures = Integer.parseInt(scanner.nextLine());
        int additionalBonus = Integer.parseInt(scanner.nextLine());

        double maximumBonusPoints = Double.MIN_VALUE;
        double maxAttendance = Double.MIN_VALUE;

        for (int i = 0; i < numberOfStudents; i++) {
            double countOfAttendances = Double.parseDouble(scanner.nextLine());
            double totalBonusPoints = Math.ceil((countOfAttendances / numberOfLectures) * (5 + additionalBonus));

            if (countOfAttendances > maxAttendance) {
                maxAttendance = countOfAttendances;
            }
            if (totalBonusPoints > maximumBonusPoints) {
                maximumBonusPoints = totalBonusPoints;
            }

        }

        System.out.printf("Max Bonus: %.0f.\nThe student has attended %.0f lectures.\n", maximumBonusPoints, maxAttendance);
        scanner.close();
    }
}
