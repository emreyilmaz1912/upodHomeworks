package copyPriceCalculation_Odev2;


public class RecursiveCalculatePrice {

    int recursiveCalculatePrice(int n) {
        int sum = 0;

        if (n >= 25) {
            sum = (n / 25) * 100;
            sum += recursiveCalculatePrice(n % 25);
            return sum;
        } else if (n >= 12) {
            sum = (n / 12) * 50;
            sum += recursiveCalculatePrice(n % 12);

            return sum;
        }
        return n * 5;

    }
}
