package _12_FinalExamPreparation.PF_2023_September_1;

import java.util.Scanner;

public class _01_WorldTour {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String stops = scanner.nextLine();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("Travel")) {
                break;
            }

            String[] commandParts = line.split(":");
            String command = commandParts[0];

            switch (command) {
                case "Add Stop":
                    int idx = Integer.parseInt(commandParts[1]);
                    String stop = commandParts[2];
                    if (isValidIdx(idx, stops)) {
                        String left = stops.substring(0, idx);
                        String right = stops.substring(idx);

                        stops = left + stop + right;
                    }
                    break;
                case "Remove Stop":
                    int startIdx = Integer.parseInt(commandParts[1]);
                    int endIdx = Integer.parseInt(commandParts[2]);

                    if (isValidIdx(startIdx, stops) && isValidIdx(endIdx, stops)) {
                        String left = stops.substring(0, startIdx);
                        String right = stops.substring(endIdx + 1);

                        stops = left + right;
                    }
                    break;
                case "Switch":
                    String olrStr = commandParts[1];
                    String newStr = commandParts[2];

                    stops = stops.replace(olrStr, newStr);
                    break;

            }
			
            System.out.println(stops);
        }
		
        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }

    private static boolean isValidIdx(int idx, String str) {
        return idx >= 0 && idx < str.length();
    }
}
