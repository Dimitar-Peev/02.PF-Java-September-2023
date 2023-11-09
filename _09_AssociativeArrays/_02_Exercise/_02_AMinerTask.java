package _09_AssociativeArrays._02_Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_AMinerTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> resourcesQuantity = new LinkedHashMap<>();

        String resource = scanner.nextLine(); 
        while (!resource.equals("stop")) {

            int quantity = Integer.parseInt(scanner.nextLine());
       
            if (!resourcesQuantity.containsKey(resource)) {
                resourcesQuantity.put(resource, quantity);
            } else {
                int currentQuantity = resourcesQuantity.get(resource);
                resourcesQuantity.put(resource, currentQuantity + quantity);
            }
            resource = scanner.nextLine();
        }

        resourcesQuantity.entrySet().forEach(entry -> System.out.println(entry.getKey() + " -> " + entry.getValue()));
    }
}
