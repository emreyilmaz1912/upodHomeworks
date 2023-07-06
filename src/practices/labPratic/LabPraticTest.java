package practices.labPratic;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class LabPraticTest {
    public static void main(String[] args) {
        int selected = 1;
        LabPratic labPratic = new LabPratic();
        Scanner input = new Scanner(System.in);

        labPratic.menu();
        labPratic.createRandomPassword();

        while (selected != 0) {
            System.out.println("Parolanızı onaylıyor musunuz?\n0 - Onay\n1 - Yeni parola oluştur\n2 - Oluşturduğun tüm şifreleri gör\n3 - Password dosyasının içini temizle\nSeçiminiz : ");
            selected = input.nextInt();
            switch (selected) {
                case 0:
                    System.out.println("İyi Günler");
                    break;
                case 1:
                    labPratic = new LabPratic();
                    labPratic.menu();
                    labPratic.createRandomPassword();
                    break;
                case 2:
                    labPratic.readFile();
                    break;
                case 3:
                    labPratic.clearFile();
            }
        }
    }
}
