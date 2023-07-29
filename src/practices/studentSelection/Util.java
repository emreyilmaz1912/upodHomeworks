package practices.studentSelection;

public enum Util {
    FILE_NAME ("C:\\Users\\emrey\\Masaüstü\\java1\\project\\studentNote\\studentList.txt");
    String path;

    Util(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
