package practices.studentUsers;


import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private String id;
    private String userName;
    private String password;
    private int selected = 1;

    Scanner input = new Scanner(System.in);

    public Menu() {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getMenu() throws IOException {
        while (selected != 0) {
            System.out.println("1 - Öğrenci Girişi Yap\n2 - Kayıt Ol\n3 - Yönetici Girişi\n0 - Çıkış");
            System.out.print("Seçiminiz :");
            selected = input.nextInt();
            switch (selected) {
                case 1:
                    System.out.println(loginMenu());
                    break;
                case 2:
                    Register register = new Register();
                    System.out.println("Yeni kullanıcı oluşturmak için lütfen aşağıdaki bilgileri giriniz : ");
                    try {
                        register.register();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    System.out.println(adminMenu());
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }
        }

    }

    public String loginMenu() {
        System.out.println("Lütfen öğrenci numaranızı giriniz :");
        id = input.next();
        System.out.println("Lütfen kullanıcı adınızı giriniz :");
        userName = input.next();
        System.out.println("Lütfen şifrenizi giriniz :");
        password = input.next();

        IsControlValue isControlValue = new IsControlValue(userName, password);
        if (isControlValue.isCorrect()) {
            System.out.println("Giriş yapıldı!");
            Student student = new Student();
            student.loadStudentInformationToFile();
            student.studentInfo(id);

            return  "İyi dersler!";
        } else {
            System.out.println("Giriş başarısız. Kullanıcı adı veya şifre hatalı.");
            return loginMenu();
        }

    }
    public String adminMenu() throws IOException {
        System.out.println("Lütfen yönetici kullanıcı adınızı giriniz :");
        String adminUserName = input.next();
        System.out.println("Lütfen yönetici şifrenizi giriniz :");
        String passwordAdmin = input.next();
        IsControlValue isControlValueAdmin = new IsControlValue(adminUserName,passwordAdmin);
        if (isControlValueAdmin.isCorrectAdministrator()){
            System.out.println("Giriş Başarılı!");
            Student student = new Student();
            student.setStudent();
            //student.writeStudentInfo();
            //student.loadStudentInformationToFile();

        }else {
            System.out.println("Giriş başarısız. Kullanıcı adı veya şifre hatalı.");
            return adminMenu();
        }
        return "Kayıt işlemi başarılı!";
    }
}