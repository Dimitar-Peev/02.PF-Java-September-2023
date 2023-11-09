package FundamentalsExams._02_ProgrammingFundamentalsMidExam;

import java.util.Scanner;

public class _01_SoftUniReception {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int secondEmployeeEfficiency = Integer.parseInt(scanner.nextLine());
        int thirdEmployeeEfficiency = Integer.parseInt(scanner.nextLine());

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int hours = 0;

        while (studentsCount > 0){
           studentsCount-=firstEmployeeEfficiency;
           studentsCount-=secondEmployeeEfficiency;
           studentsCount-=thirdEmployeeEfficiency;
           hours++;
           if(hours % 4 == 0){
               hours++;
           }
        }

        System.out.printf("Time needed: %dh.", hours);

        scanner.close();
    }
}
