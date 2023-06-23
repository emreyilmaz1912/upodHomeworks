package calculateHomeWork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        PrimeNumber primeNumber = new PrimeNumber();
        Fibonacci fibonacci = new Fibonacci();
        PerfectNumber perfectNumber = new PerfectNumber();

        String menu = "1 - Asal sayı doğrulaması\n" + "2 - Fibonacci serisinin ilk N sayıda terimini yazdırma\n" + "3 - Mükemmel sayı doğrulaması\n" + "0 - Çıkış";

        do {
            System.out.println(menu);
            System.out.println("----------------------------------------");
            System.out.print("LÜtfen yapmak istediğiniz işlemi seçiniz :");
            select = input.nextInt();
            switch (select) {
                case 1:
                    System.out.print("Asal sayı doğrulaması için sayınızı giriniz :");
                    int isAsal = input.nextInt();
                    primeNumber.primeNumber(isAsal);
                    break;
                case 2:
                    System.out.print("Fibonacci serisinin ilk kaç sayısını görmek istediğiniz sayıyı giriniz :");
                    int fibonacciNumber = input.nextInt();
                    fibonacci.fibonacci(fibonacciNumber);
                    break;
                case 3:
                    System.out.print("Mükemmel sayı doğrulaması için bir sayı giriniz :");
                    int perfect = input.nextInt();
                    perfectNumber.perfectNumber(perfect);
                    break;
                case 0:
                    break;
            }
            System.out.println("----------------------------------------");

        } while (select != 0);
    }
}
