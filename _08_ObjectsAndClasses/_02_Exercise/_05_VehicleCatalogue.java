import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _05_VehicleCatalogue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicles = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] inputLine = input.split(" ");
            String type = inputLine[0];
            String model = inputLine[1];
            String color = inputLine[2];
            int horsepower = Integer.parseInt(inputLine[3]);
            vehicles.add(new Vehicle(type, model, color, horsepower));
            input = scanner.nextLine();
        }

        double sumCar = 0;
        double sumTruck = 0;
        int countCar = 0;
        int countTruck = 0;

        String model = scanner.nextLine();
        while (!model.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(model)) {
                    System.out.println(vehicle);
                }
            }
            model = scanner.nextLine();
        }

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getType().equals("car")) {
                sumCar += vehicle.getHorsePower();
                countCar++;
            } else if (vehicle.getType().equals("truck")) {
                sumTruck += vehicle.getHorsePower();
                countTruck++;
            }
        }

        double averageCars = getAverage(sumCar, countCar);
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        double averageTrucks = getAverage(sumTruck, countTruck);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);
    }

    private static double getAverage(double sum, int count) {
        double average = sum / count;
        if (count == 0) {
            average = 0;
        }
        return average;
    }

    public static class Vehicle {
        private String type;
        private String model;

        private String color;
        private int horsePower;

        public void setType(String type) {
            this.type = type;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setHorsePower(int horsePower) {
            this.horsePower = horsePower;
        }

        public String getType() {
            return type;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getHorsePower() {
            return horsePower;
        }


        public Vehicle(String type, String model, String color, int horsePower) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            String typeVeh = type.equals("car") ? "Car" : "Truck";
            String text = String.format("Type: %s%n" +
                    "Model: %s%n" +
                    "Color: %s%n" +
                    "Horsepower: %d", typeVeh,model,color,horsePower);
            return text;
        }
    }
}
