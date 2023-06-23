package calculateHomeWork;

public class PerfectNumber {

    public void perfectNumber(int number) {
        int result = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        if (result == number) {
            System.out.println(number + " sayısı mükemmel bir sayıdır.");
        } else {
            System.out.println(number + " sayısı mükemmel bir sayı değildir.");
        }
    }
}
