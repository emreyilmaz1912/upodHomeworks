package practices.shapeWithStars;

import java.util.Scanner;

public class RightTriangle {

    private static void rightTriangle(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yatay uzunluğu giriniz :");
        int horizontal = scan.nextInt();
        int sembol = 1;

        for (int i = 0; i < horizontal; i++){
            for (int j = 0; j < sembol; j++){
                System.out.print("*");
            }
            System.out.println();
            sembol++;
        }


    }

    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        rightTriangle();
    }
}
