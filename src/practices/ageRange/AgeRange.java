package practices.ageRange;
import java.util.Scanner;

public class AgeRange {

    public static void ageRange() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Yaş aralığını öğrenmek için yaşınızı giriniz :");
            int age = input.nextInt();
            while (age < 0 || age > 120) {
                System.out.print("Hatalı giriş yaptınız! 0-120 arasında bir yaş giriniz. :");
                age = input.nextInt();
            }
            if (age <= 3) {
                System.out.println(age + " yaş bebek yaş aralığındadır.");
            } else if (age >= 4 && age <= 12) {
                System.out.println(age + " yaş çocuk yaş aralığındadır.");
            } else if (age >= 13 && age <= 19) {
                System.out.println(age + " yaş ergen yaş aralığındadır.");
            } else if (age >= 20 && age <= 30) {
                System.out.println(age + " yaş genç yaş aralığındadır.");
            } else if (age >= 31 && age <= 59) {
                System.out.println(age + " yaş orta yaşlı yaş aralığındadır.");
            } else if (age >= 60 && age <= 120) {
                System.out.println(age + " yaş yaşlı yaş aralığındadır.");
            }
        }
    }

    public static void main(String[] args) {
        AgeRange ageRange = new AgeRange();
        ageRange();
    }


}
