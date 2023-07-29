package singleton;

public class Singleton {
    private static String adminName;
    private static String adminPassword;

    private static Singleton singleton = new Singleton();

    private Singleton() {
        adminName = "admin";
        adminPassword = "123456";
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public void printAdminInfo() {
        System.out.println("Admin kullanıcı adı : " + adminName + "\nAdmin Şifresi : " + adminPassword);
    }

}
