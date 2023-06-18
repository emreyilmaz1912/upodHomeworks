package copyPriceCalculation_Odev2;

import java.util.Scanner;

public class CopyPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculatePrice calculatePrice = new CalculatePrice();
        RecursiveCalculatePrice recursiveCalculatePrice = new RecursiveCalculatePrice();
        System.out.print("Kaç adet fotokopi çektirmek istiyorsunuz? :");
        int n = input.nextInt();

        calculatePrice.calculatePrice(n);
        System.out.println("Toplam fotokopi ücretiniz  : " + calculatePrice.calculatePrice(n) + " kuruş");

        recursiveCalculatePrice.recursiveCalculatePrice(n);
        System.out.println("Toplam fotokopi ücretiniz(recursive)  : " + recursiveCalculatePrice.recursiveCalculatePrice(n) + " kuruş");
    }
}
