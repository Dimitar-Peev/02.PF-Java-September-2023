package _08_ObjectsAndClasses._01_Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class _03_BigFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt(scanner.nextLine());

        BigInteger result = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        System.out.println(result);
    }
}
