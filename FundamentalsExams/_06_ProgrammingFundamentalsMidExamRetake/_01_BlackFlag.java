package FundamentalsExams._06_ProgrammingFundamentalsMidExamRetake;

import java.util.Scanner;

public class _01_BlackFlag {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int dailyPlunder = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double gainedPlunder = 0;

        for (int currentDay = 1; currentDay <= days; currentDay++) {
            if (currentDay % 3 == 0) {
                double dailyPlunderMore = dailyPlunder * 0.5;
                gainedPlunder = gainedPlunder + dailyPlunder + dailyPlunderMore;
            } else {
                gainedPlunder += dailyPlunder;
            }

            if (currentDay % 5 == 0) {
                gainedPlunder *= 0.7;
            }
        }

        if (gainedPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", gainedPlunder);
        } else {
            double percentagePlunder = (gainedPlunder / expectedPlunder) * 100;
            System.out.printf("Collected only %.2f%% of the plunder.", percentagePlunder);
        }


    }
}
