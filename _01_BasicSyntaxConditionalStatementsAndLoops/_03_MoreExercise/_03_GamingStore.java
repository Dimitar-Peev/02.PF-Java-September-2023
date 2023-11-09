package _01_BasicSyntaxConditionalStatementsAndLoops._03_MoreExercise;

import java.util.Scanner;

public class _03_GamingStore {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());
        String gameName = scanner.nextLine();

        double totalSpending = 0;
        while (!gameName.equals("Game Time")) {
            switch (gameName) {
                case "OutFall 4":
                case "RoverWatch Origins Edition":
                    if (39.99 > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        if (gameName.equals("OutFall 4")) {
                            System.out.println("Bought OutFall 4");
                        } else {
                            System.out.println("Bought RoverWatch Origins Edition");
                        }
                        balance -= 39.99;
                        totalSpending+= 39.99;
                    }
                    break;
                case "CS: OG":
                    if (15.99 > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought CS: OG");
                        balance -= 15.99;
                        totalSpending+= 15.99;
                    }
                    break;
                case "Zplinter Zell":
                    if (19.99 > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Zplinter Zell");
                        balance -= 19.99;
                        totalSpending+= 19.99;
                    }
                    break;
                case "Honored 2":
                    if (59.99 > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought Honored 2");
                        balance -= 59.99;
                        totalSpending+= 59.99;
                    }
                    break;
                case "RoverWatch":
                    if (29.99 > balance) {
                        System.out.println("Too Expensive");
                    } else {
                        System.out.println("Bought RoverWatch");
                        balance -= 29.99;
                        totalSpending+= 29.99;
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (balance <= 0) {
                System.out.println("Out of money!");
                return;
            }
            gameName = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f",
                totalSpending, balance);
    }
}
