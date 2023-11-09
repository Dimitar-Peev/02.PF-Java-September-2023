package _02_DataTypesAndVariables._02_Exercise;

import java.util.Scanner;

public class _08_BeerKegs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine()); 

        double maxVolume = 0; 
        String maxModel = ""; 

        for (int keg = 1; keg <= countKegs; keg++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume >  maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }
        }

        System.out.println(maxModel);
    }
}
