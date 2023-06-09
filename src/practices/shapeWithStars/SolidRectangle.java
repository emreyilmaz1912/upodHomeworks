package practices.shapeWithStars;

import java.util.Scanner;

public class SolidRectangle {

    public static void solidRectangle(){

        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz :");
        int n = input.nextInt();
        System.out.print("Sütun sayısını giriniz :");
        int m = input.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("*");

           for (int j = 0; j < m; j++) {
               System.out.print("*");
           }
            System.out.println();
        }

    }
    public static void main(String[] args) {
    SolidRectangle solidRectangle = new SolidRectangle();
    solidRectangle();
    }
}
