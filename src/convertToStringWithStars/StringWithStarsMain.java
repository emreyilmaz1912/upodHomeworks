package convertToStringWithStars;

import java.util.Scanner;

public class StringWithStarsMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Harflerin arasına yıldız (*) koyulmasını istediğiniz cümleyi yazınız :");
        String text = input.nextLine();
        ConvertToStringWithStars convertToStringWithStars = new ConvertToStringWithStars();
        String output = convertToStringWithStars.convertToStringWithStars(text);
        System.out.println(output);
    }
}
