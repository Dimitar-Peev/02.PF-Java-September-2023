package _11_RegularExpressions._02_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _06_ValidPassword {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); 
		
        String passwordRegex = "_\\.+(?<passwordText>[A-Z][A-Za-z0-9]{4,}[A-Z])_\\.+";
        Pattern pattern = Pattern.compile(passwordRegex);
		Matcher matcher = null;

        for (int row = 1; row <= n; row++) {
            String password = scanner.nextLine(); 
            matcher = pattern.matcher(password);

            if (matcher.find()) {
                String textPassword = matcher.group("passwordText"); 
                StringBuilder sbCategory = new StringBuilder(); 
				
                for (char symbol : textPassword.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        sbCategory.append(symbol);
                    }
                }
				
                if (sbCategory.length() == 0) {
                    System.out.println("Group: default");
                } else {
                    System.out.println("Group: " + sbCategory.toString());
                }

            } else {
                System.out.println("Invalid pass!");
            }
        }
    }
}
