package practices.labPratic;

import java.util.Scanner;

public class LabPraticTest {
    public static int value;

    public static void main(String[] args) {

        int selected = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Şifrenin uzunluğu ne kadar olmalı? :");
        int lenghtOfPassword = input.nextInt();
        value = lenghtOfPassword;
        LabPratic labPratic = new LabPratic(lenghtOfPassword);
        labPratic.menu();
        labPratic.createCharacterSet();
        labPratic.createRandomPassword();

        while (selected != 0) {
            System.out.println("Parolanızı onaylıyor musunuz?\n0 - Onay\n1 - Yeni parola oluştur\n2 - Oluşturduğun tüm şifreleri gör\n3 - Password dosyasının içini temizle\nSeçiminiz : ");
            selected = input.nextInt();
            switch (selected) {
                case 0:
                    System.out.println("İyi Günler");
                    break;
                case 1:
                    System.out.print("Şifrenin uzunluğu ne kadar olmalı? :");
                    lenghtOfPassword = input.nextInt();
                    value = lenghtOfPassword;
                    labPratic = new LabPratic(lenghtOfPassword);
                    labPratic.menu();
                    labPratic.createRandomPassword();
                    break;
                case 2:
                    labPratic.readFile();
                    break;
                case 3:
                    labPratic.clearFile();
                    break;
            }
        }
    }
}
