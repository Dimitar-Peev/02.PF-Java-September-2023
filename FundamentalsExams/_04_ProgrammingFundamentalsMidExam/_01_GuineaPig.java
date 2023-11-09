package FundamentalsExams._04_ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class _01_GuineaPig {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double quantityFoodGr = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityHayGr = Double.parseDouble(scanner.nextLine()) * 1000;
        double quantityCoverGr = Double.parseDouble(scanner.nextLine()) * 1000;
        double guineasWeightGr = Double.parseDouble(scanner.nextLine()) * 1000;

        boolean runOut = false;

        for (int days = 1; days <= 30; days++) {
            quantityFoodGr -= 300;

            if (quantityFoodGr <= 0) {
                runOut = true;
                break;
            }

            if (days % 2 == 0) {
                double quantityHayUsed = quantityFoodGr * 0.05;
                quantityHayGr -= quantityHayUsed;
                if (quantityHayGr <= 0) {
                    runOut = true;
                    break;
                }
            }

            if (days % 3 == 0) {
                double quantityCoverUsed = guineasWeightGr / 3;
                quantityCoverGr -= quantityCoverUsed;
                if (quantityCoverGr <= 0) {
                    runOut = true;
                    break;
                }
            }


        }

        if (runOut) {
            System.out.println("Merry must go to the pet store!");
        } else {
            double quantityFoodKg = quantityFoodGr / 1000;
            double quantityHayKg = quantityHayGr / 1000;
            double quantityCoverKg = quantityCoverGr / 1000;
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFoodKg, quantityHayKg, quantityCoverKg);
        }

        scanner.close();
    }
}
