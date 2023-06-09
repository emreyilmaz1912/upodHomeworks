package practices.shapeWithStars;

import java.util.Scanner;

public class DiamondStars {

    private static void diamondStars(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Elmas büyüklüğünü giriniz :");
        int n = scan.nextInt();


        for (int i = 1; i < n; i++){
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }for (int k = 1; k <= i; k++){
                if (i==1 || k==1 )
                    System.out.print("*");
                else {
                    System.out.print("**");


                }
            }
            System.out.println();
        }
        for (int i = n; 0 < i; i--){
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }for (int k = 1; k <= i; k++){
                if (i==1  || k==1 )
                    System.out.print("*");
                else {
                    System.out.print("**");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        DiamondStars diamondStars = new DiamondStars();
        diamondStars();
    }
}
