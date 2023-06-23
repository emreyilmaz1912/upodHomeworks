package practices.circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Çevresini ve alanını hesaplamak istediğiniz dairenin yarıçapını giriniz : ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);
        Circle circle1 = new Circle();
        circle1.printInfo();
        circle.printInfo();
    }
}
