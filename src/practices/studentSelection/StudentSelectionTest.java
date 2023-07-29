package practices.studentSelection;

import practices.studentUsers.Student;

import java.awt.*;
import java.util.Scanner;

public class StudentSelectionTest {
    public static void main(String[] args) {
        int value = Integer.parseInt(args[0]);
        Scanner input = new Scanner(System.in);
        String selected = "";
        CallStudent callStudent = new CallStudent();
        callStudent.menu(value);
        callStudent.loadStudent();
        callStudent.printInfo();
        while (!selected.equals("Ç")) {
            System.out.println("1 - Daha fazla öğrenci adı soyadı yazdırmak ister misiniz?\n2 - Yazdırmak istediğiniz öğrenci sayısını kendiniz çekmek ister misiniz?\nÇ - Çıkış");
            selected = input.next().toUpperCase();
            switch (selected) {
                case "1":
                    callStudent.menu(value);
                    callStudent.printInfo();
                    break;
                case "2":
                    callStudent.menu();
                    callStudent.printInfo();
                case "Ç":
                    System.out.println("İyi günler");
                    break;
            }
        }
    }
}
