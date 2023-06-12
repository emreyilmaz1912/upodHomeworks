package copyPriceCalculation_Odev2;



public class CalculatePrice {
    double totalPrice = 0.0;
    final double copyPriceMin = 0.05;
    final double copyPriceMid = 0.50/12;

    final double copyPriceMax = 1.00/25;

    int calculatePrice(int n) {
        if (n <= 0){
            return 0;
        }else if (n >= 1 && n < 12){
            totalPrice = n * copyPriceMin;
        }else if (n >= 12 &&n < 25 ){
            totalPrice = n * copyPriceMid;
        }else totalPrice = n * copyPriceMax;
        return n;
    }
        void printInfo(){
            System.out.println("Toplam fotokopi ücretiniz : " +  totalPrice);
        }

}
