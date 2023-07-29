package fibonacciBigInteger;

import java.math.BigInteger;

public class FibonacciBigInteger {

    public void fibonacciBigInteger(int number) {
        BigInteger firstValue = BigInteger.valueOf(0);
        BigInteger secondValue = BigInteger.valueOf(1);

        for (int i = 0; i < number; i++) {
            System.out.print(firstValue + " ");
            BigInteger nextValue = firstValue.add(secondValue);
            firstValue = secondValue;
            secondValue = nextValue;

        }
        System.out.println();
    }
}
