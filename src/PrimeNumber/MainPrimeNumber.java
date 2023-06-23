package PrimeNumber;

import java.util.Scanner;

public class MainPrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int n = input.nextInt();

        PrimeNumberWithSieveOfEratosthenes prime = new PrimeNumberWithSieveOfEratosthenes(n);

    }
}
