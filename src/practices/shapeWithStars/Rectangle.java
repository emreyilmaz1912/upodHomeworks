package practices.shapeWithStars;

import java.util.Scanner;

public class Rectangle {

    private static void rectangle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Üçgen uzunluğunu giriniz :");
        int n = scan.nextInt();


        for (int i = 1; i < n; i++){
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }for (int k = 1; k <= i; k++){
                if (i==1 || i==n || k==1 || k==n)
                System.out.print("*");
               else {
                    System.out.print("**");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle();
    }
}
