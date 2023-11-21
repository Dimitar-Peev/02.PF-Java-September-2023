package _FundamentalsExams._03_ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_NeedForSpeedIII {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Car> carMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inpuArr = scanner.nextLine().split("\\|");
            Car car = new Car(inpuArr[0], Integer.parseInt(inpuArr[1]), Integer.parseInt(inpuArr[2]));
            carMap.put(car.getName(), car);
        }

        String commands = scanner.nextLine();
        while (!"Stop".equals(commands)) {
            String[] commandsArr = commands.split(" : ");
            switch (commandsArr[0]) {
                case "Drive":
                    drive(carMap, commandsArr[1], Integer.parseInt(commandsArr[2]), Integer.parseInt(commandsArr[3]));
                    break;
                case "Refuel":
                    refuel(carMap, commandsArr[1], Integer.parseInt(commandsArr[2]));
                    break;
                case "Revert":
                    revert(carMap, commandsArr[1], Integer.parseInt(commandsArr[2]));
                    break;
            }
            commands = scanner.nextLine();
        }

        for (Car car : carMap.values()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n", car.getName(), car.getMileage(), car.getFuel());
        }

    }

    private static void drive(Map<String, Car> carMap, String carName, int distance, int fuel) {
        Car car = carMap.get(carName);

        int currentFuel = car.getFuel();
        int currentKm = car.getMileage();
		
        if (currentFuel < fuel) {
          System.out.println("Not enough fuel to make that ride");
        } else {
            car.setMileage(currentKm + distance);
            car.setFuel(currentFuel - fuel);
            System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n", car.getName(), distance, fuel);
        }
		
        if (car.getMileage() >= 100000) {
            System.out.printf("Time to sell the %s!%n", car.getName());
            carMap.remove(car.getName());
        }
    }

    private static void refuel(Map<String, Car> carMap, String carName, int fuel) {
        Car car = carMap.get(carName);

        int oldFuel = car.getFuel();
        int newFuel = Math.min(car.getFuel() + fuel, 75);
		
        car.setFuel(newFuel);
        System.out.printf("%s refueled with %d liters%n", car.getName(), newFuel - oldFuel);
    }

    private static void revert(Map<String, Car> carMap, String carName, int kilometers) {
        Car car = carMap.get(carName);

        int kmAfterRevert = car.getMileage() - kilometers;

        if (kmAfterRevert < 10000) {
            kmAfterRevert = 10000;
        } else {
            System.out.printf("%s mileage decreased by %d kilometers%n", car.getName(), kilometers);
        }

        car.setMileage(kmAfterRevert);
    }

    public static class Car {
        private String name;
        private int mileage;
        private int fuel;

        public Car(String carName, int mileage, int fuel) {
            this.name = carName;
            this.mileage = mileage;
            this.fuel = fuel;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMileage() {
            return mileage;
        }

        public void setMileage(int mileage) {
            this.mileage = mileage;
        }

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }
    }
}