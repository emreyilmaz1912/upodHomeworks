package practices.shapeWithStars;

import java.util.Scanner;

public class HollowRectangle {

    private static void hollowRectangle(){

        Scanner inp = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz :");
        int row = inp.nextInt();
        System.out.print("Sütun sayısını giriniz :");
        int cloumn = inp.nextInt();

        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= cloumn; j++) {
                if (i==1 || i==row || j==1 || j==cloumn)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        HollowRectangle hollowRectangle = new HollowRectangle();
        hollowRectangle();
    }
}

