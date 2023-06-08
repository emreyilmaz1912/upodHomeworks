import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Ders notu hesaplama programına hoşgeldiniz..!");
        Scanner input = new Scanner(System.in);
        System.out.print("Öğrenci sayısnı giriniz :");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Öğrenci " + (i + 1) + ":");
            System.out.print("Lütfen öğrencinin adını giriniz :");
            String name = input.next();
            System.out.print("Lütfen öğrencinin soyadını giriniz :");
            String surname = input.next();
            System.out.print("Lütfen öğrencinin vize notunu giriniz :");
            int midtermNote = input.nextInt();
            while (midtermNote < 0 || midtermNote > 100) {
                System.out.print("Hatalı giriş yaptınız! Lütfen 0 - 100 arasında bir değer giriniz : ");
                midtermNote = input.nextInt();
            }
            System.out.print("Lütfen öğrencinin final notunu giriniz :");
            int finalNote = input.nextInt();
            while (finalNote < 0 || finalNote > 100) {
                System.out.print("Hatalı giriş yaptınız! Lütfen 0 - 100 arasında bir değer giriniz : ");
                finalNote = input.nextInt();
            }

            StudentInformation studentInformation = new StudentInformation(name, surname, midtermNote, finalNote);
            studentInformation.printInfo();
        }

    }
}