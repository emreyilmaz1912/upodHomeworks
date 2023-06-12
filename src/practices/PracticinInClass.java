package practices;

import java.util.Scanner;

public class PracticinInClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        System.out.print("Toplamak istediğiniz sayıları girin. Program sonransın istiyorsanız 0'a basınız :");


        while (true){
            int number = scan.nextInt();
            if (number == 0)
                break;
            sum += number;
            System.out.println(sum);
        }


    }
}
