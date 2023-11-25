package _12_FinalExamPreparation.PF_2023_September_2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_Pirates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> townPopulation = new LinkedHashMap<>();
        Map<String, Integer> townGold = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Sail")) {
            String town = input.split("\\|\\|")[0]; 
            int population = Integer.parseInt(input.split("\\|\\|")[1]); 
            int gold = Integer.parseInt(input.split("\\|\\|")[2]); 

            if (!townPopulation.containsKey(town) && !townGold.containsKey(town)) {
                townPopulation.put(town, population);
                townGold.put(town, gold);
            } else {
                townPopulation.put(town, townPopulation.get(town) + population);
                townGold.put(town, townGold.get(town) + gold);

            }

            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] commandParts = command.split("=>");
            String commandName = commandParts[0]; 
            String town = commandParts[1]; 

            switch (commandName) {
                case "Plunder":
                    int killedPeople = Integer.parseInt(commandParts[2]); 
                    int stealGold = Integer.parseInt(commandParts[3]); 
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", town, stealGold, killedPeople);
                    townPopulation.put(town, townPopulation.get(town) - killedPeople);
                    townGold.put(town, townGold.get(town) - stealGold);

                    if (townPopulation.get(town) <= 0 || townGold.get(town) <= 0) {
                        townPopulation.remove(town);
                        townGold.remove(town);
                        System.out.printf("%s has been wiped off the map!%n", town);
                    }
                    break;

                case "Prosper":
                    int earnedGold = Integer.parseInt(commandParts[2]); 
					
                    if (earnedGold <= 0) {
                        System.out.println("Gold added cannot be a negative number!");
                    } else {
                        townGold.put(town, townGold.get(town) + earnedGold);
                        System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n",
                                earnedGold, town, townGold.get(town));
                    }
                    break;
            }
            command = scanner.nextLine();
        }

        if (townPopulation.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", townGold.size());
            townGold.entrySet().forEach(entry -> {
                String town = entry.getKey();
                int gold = entry.getValue();
                int population = townPopulation.get(town);
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", town, population, gold);
            });
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }
}
