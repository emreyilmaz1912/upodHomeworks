package primeNumber;

import java.util.Arrays;

public class PrimeNumberWithSieveOfEratosthenes {

    public PrimeNumberWithSieveOfEratosthenes(int n) {
        numberList(n);
    }

    public void numberList(int n) {
        int[] numberList = new int[n - 1];
        boolean[] primeNumber = new boolean[n + 1];
        Arrays.fill(primeNumber, true);

        //n'e kadar olan sayıları 2'den başlayıp array'e ekleyip listeyeleyecek

        for (int i = 0; i < n - 1; i++) {
            numberList[i] = 2 + i;
        }

        System.out.print(n + " 'e kadar olan sayılar : " + "[");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(numberList[i] + " ");
        }
        System.out.print("]");
        System.out.println();

        // Asal sayılar

        for (int i = 2; i * i < numberList.length; i++) {
            if (primeNumber[i]) {
                for (int j = i * i; j < numberList.length; j += i) {
                    primeNumber[j] = false;
                }
            }
        }
        System.out.print(n + " 'e kadar asal sayılar : " + "[");
        for (int i = 2; i <= n - 2; i++) {
            if (primeNumber[i]) {
                System.out.print(i + " ");

            }
        }
        System.out.print("]");
    }
}





