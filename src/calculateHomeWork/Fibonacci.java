package calculateHomeWork;


public class Fibonacci {

    public void fibonacci(int number) {
        int firstValue = 0;
        int secondValue = 1;

        for (int i = 0; i < number; i++) {
            System.out.print(firstValue + " ");

            int nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;

        }
        System.out.println();
    }
}
