package practices.shapeWithStars;

import java.util.Scanner;

public class SolidRectangle {

    private static void solidRectangle(){

        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz :");
        int row = input.nextInt();
        System.out.print("Sütun sayısını giriniz :");
        int cloumn = input.nextInt();

        for (int i = 0; i < row; i++){
            System.out.print("*");

           for (int j = 0; j < cloumn; j++) {
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
