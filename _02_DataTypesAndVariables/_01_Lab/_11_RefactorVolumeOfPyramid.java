package _02_DataTypesAndVariables._01_Lab;

import java.util.Scanner;

public class _11_RefactorVolumeOfPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double height = 0;
		
        System.out.print("Length: ");
        length = Double.parseDouble(scanner.nextLine());
        System.out.print("Width: ");
        width = Double.parseDouble(scanner.nextLine());
        System.out.print("Height: ");
        height = Double.parseDouble(scanner.nextLine());
        height = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", height);
    }
}
