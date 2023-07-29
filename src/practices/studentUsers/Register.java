package practices.studentUsers;

import java.io.*;
import java.util.*;

public class Register {
    Scanner input = new Scanner(System.in);
    String id;
    String name;
    String surname;
    String userName;
    String password;
    String passwordControl;


    private static  String FILE_PATH = "users.txt";
    public static List<Users> usersData = new ArrayList<>();


    public boolean register() throws IOException {
        System.out.println("Öğrenci numaranızı giriniz :");
        id = input.nextLine();
        System.out.println("Lütfen Adınızı giriniz :");
        name = input.nextLine();
        System.out.println("Lütfen Soyadınızı giriniz :");
        surname = input.nextLine();
        System.out.println("Lütfen bir kullanıcı adı giriniz :");
        userName = input.nextLine();
        System.out.println("Lütfen bir şifre giriniz :");
        password = input.nextLine();
        System.out.println("Lütfen şifrenizi tekrar giriniz :");
        passwordControl = input.nextLine();

        if (password.contains(passwordControl)){
            writeUsersAdd();
            loadStudentToFileAndUsers();

            return true;
        }else {
            register();
        }
        return false;
    }

    public void writeUsersAdd() throws IOException {
          File file = new File(FILE_PATH);
            if (!file.exists()){
                file.createNewFile();
            }
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        bWriter.newLine();
        bWriter.write(getId() + "," +getName()+","+getSurname()+","+getUserName() + "," + getPassword());
        loadStudentToFileAndUsers();
        System.out.println("Yeni kullanıcı oluşturuldu!");
        bWriter.close();
    }
    public static void loadStudentToFileAndUsers(){
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    Users user = new Users(data[0], data[1], data[2], data[3], data[4]);
                    usersData.add(user);
                }
            }
        } catch (IOException e) {
            System.out.println("Kullanıcı verileri yüklenirken bir hata oluştu: " + e.getMessage());
        }
    }



    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public String getUserName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
