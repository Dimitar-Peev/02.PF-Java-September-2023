package _14_FundamentalsExams._05_ProgrammingFundamentalsFinalExam;

import java.util.*;

public class _03_Pirates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        Map<String, City> cities = new LinkedHashMap<>();

        while (!userInput.equals("Sail")) {
            String[] cityData = userInput.split("\\|\\|");
            String cityName = cityData[0];
            int population = Integer.parseInt(cityData[1]);
            int gold = Integer.parseInt(cityData[2]);

            if (!cities.containsKey(cityName)) {
                City city = new City(cityName, population, gold);
                cities.put(cityName, city);
            } else {
                int currentCityPopulation = cities.get(cityName).getPopulation();
                int currentCityGold = cities.get(cityName).getGold();
                cities.get(cityName).setPopulation(currentCityPopulation + population);
                cities.get(cityName).setGold(currentCityGold + gold);
            }

            userInput = scanner.nextLine();
        }

        userInput = scanner.nextLine();

        while (!userInput.equals("End")) {
            String[] commandParts = userInput.split("=>");
            String commandName = commandParts[0];
            String cityName = commandParts[1];

            switch (commandName) {
                case "Plunder":
                    int peopleKilled = Integer.parseInt(commandParts[2]);
                    int goldStolen = Integer.parseInt(commandParts[3]);

                    int peopleBeforePlunder = cities.get(cityName).getPopulation();
                    int goldBeforePlunder = cities.get(cityName).getGold();

                    int remainingPeople = peopleBeforePlunder - peopleKilled;
                    int remainingGold = goldBeforePlunder - goldStolen;

                    if (remainingGold <= 0 || remainingPeople <= 0) {
                        if (remainingGold <= 0) {
                            goldStolen = goldBeforePlunder;
                        }
                        if (remainingPeople <= 0) {
                            peopleKilled = peopleBeforePlunder;
                        }
                        System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cityName, goldStolen, peopleKilled);
                        System.out.printf("%s has been wiped off the map!%n", cityName);
                        cities.remove(cityName);
                        break;
                    }
                    System.out.printf("%s plundered! %d gold stolen, %d citizens killed.%n", cityName, goldStolen, peopleKilled);
                    cities.get(cityName).setPopulation(remainingPeople);
                    cities.get(cityName).setGold(remainingGold);
                    break;

                case "Prosper":
                    int goldProsper = Integer.parseInt(commandParts[2]);
                    if (goldProsper < 0) {
                        System.out.println("Gold added cannot be a negative number!");
                        break;
                    }
                    int goldBeforeProsper = cities.get(cityName).getGold();
                    int goldAfterProsper = goldBeforeProsper + goldProsper;
                    cities.get(cityName).setGold(goldAfterProsper);
                    System.out.printf("%d gold added to the city treasury. %s now has %d gold.%n", goldProsper, cityName, goldAfterProsper);
                    break;
            }

            userInput = scanner.nextLine();
        }

        if (cities.size() > 0) {
            System.out.printf("Ahoy, Captain! There are %d wealthy settlements to go to:%n", cities.size()); 

            cities.entrySet().forEach(entry -> {
                System.out.printf("%s -> Population: %d citizens, Gold: %d kg%n", entry.getKey(), entry.getValue().getPopulation(), entry.getValue().getGold());
            });
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }

    }


    public static class City {
        private String name;
        private Integer population;
        private Integer gold;


        public City(String name, Integer population, Integer gold) {
            this.name = name;
            this.population = population;
            this.gold = gold;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

        public Integer getGold() {
            return gold;
        }

        public void setGold(Integer gold) {
            this.gold = gold;
        }
    }
}
