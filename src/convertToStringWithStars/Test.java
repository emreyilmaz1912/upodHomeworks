package convertToStringWithStars;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Harflerin arasına yılsız (*) koymamı istediğiniz cümleyi yazınız :");
        String text = input.nextLine();
        ConvertToStringWithStars convertToStringWithStars = new ConvertToStringWithStars();
        String output = convertToStringWithStars.convertToStringWithStars(text);

        System.out.println(output);
    }
}
