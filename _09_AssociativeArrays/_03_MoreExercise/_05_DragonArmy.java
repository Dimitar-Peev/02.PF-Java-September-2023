package _09_AssociativeArrays._03_MoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class _05_DragonArmy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Map<String, List<Integer>>> dragons = new LinkedHashMap<>();

        for (int index = 1; index <= n; index++) {
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String colorDragon = input.get(0);
            String nameDragon = input.get(1);
            int damage = input.get(2).equals("null") ? 45 : Integer.parseInt(input.get(2));
            int health = input.get(3).equals("null") ? 250 : Integer.parseInt(input.get(3));;
            int armor = input.get(4).equals("null") ? 10 : Integer.parseInt(input.get(4));

            Map<String, List<Integer>> dragonsStats = new TreeMap<>();
            List<Integer> stats = new ArrayList<>();
            stats.add(damage);
            stats.add(health);
            stats.add(armor);
            dragonsStats.put(nameDragon, stats);

            if (!dragons.containsKey(colorDragon)) {
                dragons.put(colorDragon, dragonsStats);
            } else {
                dragons.get(colorDragon).remove(nameDragon);
                dragons.get(colorDragon).put(nameDragon, stats);
            }
        }

        dragons.forEach((key, value) -> {
            double damage = 0;
            double health = 0;
            double armor = 0;
            for (List<Integer> number : value.values()) {
                damage += number.get(0);
                health += number.get(1);
                armor += number.get(2);
            }
            damage /= value.size();
            health /= value.size();
            armor /= value.size();
            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", key, damage, health, armor);
            dragons.get(key).forEach((k, v)
                    -> System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n", k, v.get(0), v.get(1), v.get(2)));
        });
    }
}
