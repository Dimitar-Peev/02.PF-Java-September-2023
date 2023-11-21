package FundamentalsExams._01_ProgrammingFundamentalsFinalExamRetake;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_ThePianist {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Pieces> piecesMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputArr = scanner.nextLine().split("\\|");
            Pieces pieces = new Pieces(inputArr[0], inputArr[1], inputArr[2]);
            piecesMap.put(pieces.getPieceName(), pieces);
        }

        String commands = scanner.nextLine();
        while (!"Stop".equals(commands)) {
            String[] commandsArr = commands.split("\\|");
            switch (commandsArr[0]) {
                case "Add":
                add(piecesMap, commandsArr[1], commandsArr[2], commandsArr[3]);
                    break;
                case "Remove":
                    remove(piecesMap, commandsArr[1]);
                    break;
                case "ChangeKey":
                    changeKey(piecesMap, commandsArr[1], commandsArr[2]);
                    break;
            }

            commands = scanner.nextLine();
        }

        for (Pieces pieces : piecesMap.values()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", pieces.getPieceName(), pieces.getComposer(), pieces.getKey());
        }

    }

    private static void add(Map<String, Pieces> piecesMap, String piece, String composer, String key) {
        Pieces pieces = piecesMap.get(piece);
        if (piecesMap.containsKey(piece)) {
            System.out.printf("%s is already in the collection!%n", pieces.getPieceName());
        } else {
            pieces = new Pieces(piece, composer, key);
            piecesMap.put(piece, pieces);
            System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
        }
    }

    private static void remove(Map<String, Pieces> piecesMap, String piece) {
        if (piecesMap.containsKey(piece)) {
            piecesMap.remove(piece);
            System.out.printf("Successfully removed %s!%n", piece);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
        }
    }

    private static void changeKey(Map<String, Pieces> piecesMap, String piece, String newKey) {
        Pieces pieces = piecesMap.get(piece);
        if (piecesMap.containsKey(piece)) {
            pieces.setKey(newKey);
            System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
        } else {
            System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
        }
    }

    public static class Pieces {
        private String pieceName;
        private String composer;
        private String key;

        public Pieces(String name, String composer, String key) {
            this.pieceName = name;
            this.composer = composer;
            this.key = key;
        }
		
        public String getPieceName() {
            return pieceName;
        }

        public String getComposer() {
            return composer;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }
}