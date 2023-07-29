package practices.studentUsers;

import java.io.IOException;
import java.util.SortedSet;

import static practices.studentUsers.Register.usersData;

public class StudentTest {
    public static void main(String[] args) {

        Course tarih = new Course("Tarih", "TRH101");
        Course mat = new Course("Matematik", "MT101");
        Course java = new Course("Java'ya Giriş","Java101");
        //Student onur = new Student("A101","Onur", "Cura", "Bilgisayar Mühendisliği","tarih","mat");
        //Student emre = new Student("B201","Emre","Yılmaz","Yazılım Mühendisliği","java","mat");
        //onur.addNotes(tarih, 50, 100);
        Menu menu = new Menu();

        try {
            menu.getMenu();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
