package _01_BasicSyntaxConditionalStatementsAndLoops._02_Exercise;

import java.util.Scanner;

public class _05_Login {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		
        String userName = scanner.nextLine();
        String pass = "";
        int counter = 1;
        int length = userName.length() - 1;
		
        for (int i = length; i >= 0; i--) {
            char letter = userName.charAt(i);
            pass = pass + letter;
 
        }
		
        String passWord = scanner.nextLine();
        while (!passWord.equals(pass)) {
            passWord = scanner.nextLine();
            counter = counter + 1;
            System.out.println("Incorrect password. Try again.");
            if (counter >= 4) {
                break;
            }
        }
 
        if (passWord.equals(pass)) {
          System.out.printf("User %s logged in.", userName);
        } else {
             System.out.printf("User %s blocked!", userName);
        }
    }
}
