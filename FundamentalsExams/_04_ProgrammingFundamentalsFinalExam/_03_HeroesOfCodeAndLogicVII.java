package FundamentalsExams._04_ProgrammingFundamentalsFinalExam;

import java.util.*;

public class _03_HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, Hero> heroMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] heroParameters = input.split(" ");

            Hero hero = new Hero(heroParameters[0], Integer.parseInt(heroParameters[1]), Integer.parseInt(heroParameters[2]));
            heroMap.put(hero.getName(), hero);
        }

        String commands = scanner.nextLine();
        while (!"End".equals(commands)) {
            String[] commandParts = commands.split(" - ");
            String actions = commandParts[0];

            switch (actions) {
                case "CastSpell":
                    String heroName = commandParts[1];
                    int MPneeded = Integer.parseInt(commandParts[2]);
                    String spellName = commandParts[3];
                    castSpell(heroMap, heroName, MPneeded, spellName);
                    break;
                case "TakeDamage":
                    heroName = commandParts[1];
                    int damage = Integer.parseInt(commandParts[2]);
                    String attacker = commandParts[3];
                    takeDamage(heroMap, heroName, damage, attacker);
                    break;
                case "Recharge":
                    heroName = commandParts[1];
                    int amount = Integer.parseInt(commandParts[2]);
                    recharge(heroMap, heroName, amount);
                    break;
                case "Heal":
                    heroName = commandParts[1];
                    amount = Integer.parseInt(commandParts[2]);
                    heal(heroMap, heroName, amount);
                    break;
            }
            commands = scanner.nextLine();
        }
        

        for (Hero hero : heroMap.values()) {
            System.out.printf("%s%n  HP: %d%n  MP: %d%n", hero.getName(), hero.getHitPoints(), hero.getManaPoints());
        }


    }

    private static void castSpell(Map<String, Hero> heroMap, String heroName, int manaPoints, String spellName) {
        Hero hero = heroMap.get(heroName);

        if (hero.getManaPoints() >= manaPoints) {
            hero.setManaPoints(hero.getManaPoints() - manaPoints);
            System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero.getName(), spellName, hero.getManaPoints());
        } else {
            System.out.printf("%s does not have enough MP to cast %s!%n", hero.getName(), spellName);
        }
    }

    private static void takeDamage(Map<String, Hero> heroMap, String heroName, int damage, String attacker) {
        Hero hero = heroMap.get(heroName);

        hero.setHitPoints(hero.getHitPoints() - damage);
        if (hero.getHitPoints() > 0) {
            System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero.getName(), damage, attacker, hero.getHitPoints());
        } else {
            System.out.printf("%s has been killed by %s!%n", hero.getName(), attacker);
            heroMap.remove(heroName);
        }

    }

    private static void recharge(Map<String, Hero> heroMap, String heroName, int amount) {
        Hero hero = heroMap.get(heroName);

        int oldManaPoints = hero.getManaPoints();
        int newManaPoints = Math.min(hero.getManaPoints() + amount, 200);
        hero.setManaPoints(newManaPoints);

        System.out.printf("%s recharged for %d MP!%n", hero.getName(), newManaPoints - oldManaPoints);
    }

    private static void heal(Map<String, Hero> heroMap, String heroName, int amount) {
        Hero hero = heroMap.get(heroName);

        int oldHitPoints = hero.getHitPoints();
        int newHitPoints = Math.min(hero.getHitPoints() + amount, 100);
        hero.setHitPoints(newHitPoints);

        System.out.printf("%s healed for %d HP!%n", hero.getName(), newHitPoints - oldHitPoints);
    }


    static class Hero {
        private String name;
        private int hitPoints;
        private int manaPoints;

        public Hero(String name, int hitPoints, int manaPoints) {
            this.name = name;
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }
    }
}