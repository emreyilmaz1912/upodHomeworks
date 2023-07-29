package fibonacciBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigIntegerTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        FibonacciBigInteger fibonacci = new FibonacciBigInteger();
        System.out.print("Lütfen fibonacci dizisini görmek için eleman sayısını(n) giriniz : ");
        int n = input.nextInt();
        fibonacci.fibonacciBigInteger(n);
    }
}
