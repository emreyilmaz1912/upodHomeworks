package calculateHomeWork;

public class PrimeNumber {

    public int primeNumber(int number) {

        int counter = 0;
        int i = 2;

        while (i < number) {
            if (number % i == 0) {
                counter++;
            }
            i++;
        }
        if (counter == 0) {
            System.out.println(number + " Asal bir sayıdır.");
        } else System.out.println(number + " Asal bir sayı değildir.");
        return number;
    }
}
