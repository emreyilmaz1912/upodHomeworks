package practices.studentUsers;
import java.util.Scanner;
import static practices.studentUsers.Register.usersData;


public class IsControlValue {
    private String userName;
    private String password;
    private String data;
    private String tempPassword = "";
    private Users user;

    public  IsControlValue(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    boolean isCorrect() {
        Register.loadStudentToFileAndUsers();
        for (Users user : usersData) {
            if (userName.equals(user.getUserName()) && password.equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
    void start() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı Adı : ");
        userName = scan.nextLine();
        System.out.print("Şifreniz : ");
        password = scan.nextLine();
        if (!isCorrect()) {
            start();
        }
    }
    boolean isCorrectAdministrator(){
        Administrator admin = new Administrator();
      boolean isValid =  userName.equals(admin.getUserName()) && password.equals(admin.getPassword());
      return isValid;
    }
}
