package calculate_Odev5;

import java.util.Scanner;

public class CalculateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int selected = 0;
        while (selected != 4) {

            System.out.print("Lütfen dizi boyutunu giriniz :");
            int n = input.nextInt();
            while (n < 0) {
                System.out.print("Lütfen pozitif bir sayı giriniz :");
                n = input.nextInt();
            }

            System.out.println("Lütfen dizi elemanlarını giriniz :");

            Calculate calculate = new Calculate(n);
            calculate.array();
            System.out.println(calculate.menu());
            System.out.print("Lütfen seçim yapınız :");
            selected = input.nextInt();

            switch (selected) {
                case 1 -> System.out.println("Dizi elemanlarının toplamı : " + calculate.plus());
                case 2 -> System.out.println("Dizi elemanlarının çarpanı : " + calculate.times());
                case 3 -> System.out.println("Dizideki en büyük eleman : " + calculate.bigNumber());
                case 4 -> {
                    System.out.println("Programdan çıkılıyor...");
                    System.out.println("İyi günler!");
                }

            }

        }


    }
}
