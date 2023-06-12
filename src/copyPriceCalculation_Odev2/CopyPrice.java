package copyPriceCalculation_Odev2;

import java.util.Scanner;

public class CopyPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    CalculatePrice calculatePrice = new CalculatePrice();
        System.out.print("Kaç adet fotokopi çektirmek istiyorsunuz? :");
        int n = input.nextInt();

    calculatePrice.calculatePrice(n);
    calculatePrice.printInfo();
    }
}
