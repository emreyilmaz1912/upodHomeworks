package copyPriceCalculation_Odev2;

public class CalculatePrice {

    int calculatePrice(int n) {
        int sum = 0;
        int sumMod;
        sum += (n / 25) * 100;
        sumMod = n % 25;
        if (sumMod >= 12) {
            sum += (sumMod / 12) * 50;
            sumMod %= 12;
        }
        return sum += sumMod * 5;
    }
}
