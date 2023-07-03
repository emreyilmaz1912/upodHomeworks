package calculate_Odev5;

import java.util.Arrays;
import java.util.Scanner;

public class Calculate {
    int n = 0;
    int[] array = new int[this.n];

    public Calculate(int n) {
        this.n = n;
    }

    public void array() {
        Scanner input = new Scanner(System.in);
        array = new int[this.n];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". elemanı giriniz :");
            array[i] = input.nextInt();
        }
        System.out.println();
       /*
        for (int arr : array){
            System.out.print(arr + " ");
        }
        */
    }

    public String menu() {
        System.out.println("**** Menü ****");
        String menu = "1 - Dizi elemanlarını topla ve sonucu ekrana yazdır." + "\n2 - Dizi elemanlarını çarp ve sonucu ekrana yazdır." + "\n3 - Dizideki en büyük elemanı bul ve ekrana yazdır." + "\n4 - Programı sonlandır. ";
        return menu;
    }

    public int plus() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int times() {
        int result = 1;
        for (int i = 0; i < array.length; i++) {
            result *= array[i];
        }
        return result;
    }

    public int bigNumber() {
        Arrays.sort(array);
        int bigNumber = array[array.length - 1];
        return bigNumber;
    }
}
