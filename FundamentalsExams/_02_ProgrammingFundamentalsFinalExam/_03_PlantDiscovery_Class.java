package FundamentalsExams._02_ProgrammingFundamentalsFinalExam;

import java.util.*;

public class _03_PlantDiscovery_Class {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
		
        Map<String, Plant> plantsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split("<->");
            Plant plant = new Plant(inputArr[0], Integer.parseInt(inputArr[1]));
            plantsMap.put(plant.getName(), plant);
        }

        String command = scanner.nextLine();
        while (!"Exhibition".equals(command)) {
            String[] commandArr = command.split(" ");
            String commandName = commandArr[0];
            String plantName = commandArr[1];

            if (plantsMap.containsKey(plantName)) {
                switch (commandName) {
                    case "Rate:":
                        add(plantsMap, commandArr[1], Double.parseDouble(commandArr[3]));
                        break;
                    case "Update:":
                        update(plantsMap, commandArr[1], Integer.parseInt(commandArr[3]));
                        break;
                    case "Reset:":
                        reset(plantsMap, commandArr[1]);
                        break;
                }
            } else {
                System.out.println("error");
            }

            command = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Plant> entry : plantsMap.entrySet()) {
            double average = 0;

            if (entry.getValue().getRating() != 0 && entry.getValue().getCount() != 0) {
                average = entry.getValue().getRating() / entry.getValue().getCount();
            }

            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", entry.getKey(), entry.getValue().getRarity(), average);
        }


    }

    public static void add(Map<String, Plant> plantsMap, String plantName, double rating) {
        Plant plant = plantsMap.get(plantName);

        plant.setCount(plantsMap.get(plantName).getCount() + 1);

        double updateRating = plant.getRating() + rating;
        plant.setRating(updateRating);
    }


    public static void update(Map<String, Plant> plantsMap, String plantName, int newRarity) {
        Plant plant = plantsMap.get(plantName);
        plant.setRarity(newRarity);
    }

    public static void reset(Map<String, Plant> plantsMap, String plantName) {
        Plant plant = plantsMap.get(plantName);
        plant.setRating(0);
        plant.setCount(0);
    }


    public static class Plant {
        private String name;
        private int rarity;
        private double rating;
        private double count;

        public Plant(String name, int rarity) {
            this.name = name;
            this.rarity = rarity;
        }

        public void setRating(double rating) {
            this.rating = rating;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getCount() {
            return count;
        }

        public void setCount(double count) {
            this.count = count;
        }

        public int getRarity() {
            return rarity;
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public double getRating() {
            return rating;
        }

    }
}