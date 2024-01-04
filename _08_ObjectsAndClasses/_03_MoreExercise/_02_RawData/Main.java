package _08_ObjectsAndClasses._03_MoreExercise._02_RawData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        HashMap<String, List<Car>> carsMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String model = input[0];
            int engineSpeed = Integer.parseInt(input[1]);
            int enginePower = Integer.parseInt(input[2]);
            int cargoWeight = Integer.parseInt(input[3]);
            Engine engine = new Engine(engineSpeed, enginePower);
            String cargoType = input[4];
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            List<Tire> tireList = new ArrayList<>();
            for (int tires = 5; tires < input.length; tires += 2) {
                Tire currentTire = new Tire(Double.parseDouble(input[tires]), Integer.parseInt(input[tires + 1]));
                tireList.add(currentTire);
            }
            Car currentCar = new Car(model, engine, cargo, tireList);
            carsMap.putIfAbsent(cargoType, new ArrayList<>());
            carsMap.get(cargoType).add(currentCar);
        }

        String cargoType = scanner.nextLine();

        carsMap.get(cargoType).forEach(car -> car.extract(cargoType));
    }
}
