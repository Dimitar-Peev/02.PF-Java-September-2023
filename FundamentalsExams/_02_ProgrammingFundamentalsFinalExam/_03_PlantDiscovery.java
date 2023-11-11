package _15_FundamentalsExams._02_ProgrammingFundamentalsFinalExam;

import java.util.*;

public class _03_PlantDiscovery {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plants = new LinkedHashMap<>();
        Map<String, List<Double>> ratings = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("<->");
            String plant = input[0];
            int rarity = Integer.parseInt(input[1]);

            plants.put(plant, rarity);
            ratings.putIfAbsent(plant, new ArrayList<>());
        }

        String input = scanner.nextLine();
        while (!input.equals("Exhibition")) {
            String[] inputLine = input.split(": ");
            String command = inputLine[0];
            String[] data = inputLine[1].split(" - ");
            String name = data[0];

            if (!plants.containsKey(name)) {
                System.out.println("error");
                input = scanner.nextLine();
                continue;
            }

            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(data[1]);
                    ratings.get(name).add(rating);
                    break;

                case "Update":
                    int updatedRarity = Integer.parseInt(data[1]);
                    plants.put(name, updatedRarity);
                    break;

                case "Reset":
                    ratings.get(name).clear();
                    break;

                default:
                    System.out.println("error");
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        
        for (Map.Entry<String, Integer> entry : plants.entrySet()) {
            String plant = entry.getKey();
            int rarity = entry.getValue();
            double averageRating = ratings.get(plant).stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plant, rarity, averageRating);
        }

    }
}
