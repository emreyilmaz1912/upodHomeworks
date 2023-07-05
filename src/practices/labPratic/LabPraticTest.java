package practices.labPratic;

import java.util.Scanner;

public class LabPraticTest {
    public static void main(String[] args) {
        int selected=1;
        Scanner input = new Scanner(System.in);
    LabPratic labPratic = new LabPratic();
    labPratic.menu();
   // labPratic.creatreCharacterSet();
    labPratic.createRandomPassword();
    while (selected != 0){
        System.out.println("Parolanızı onaylıyor musunuz?\n0 - Onay\n1 - Yeni Parola oluştur");
        selected = input.nextInt();
        switch (selected){
            case 0 :
                System.out.println("İyi Günler");
                break;
            case 1:
                labPratic = new LabPratic();
                labPratic.menu();
                labPratic.createRandomPassword();
                break;
        }
    }
    }
}
