package readerOdevi;

public class Reader {
    String name;
    int age;
    String sex;

    public Reader(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void read(Book book, int currentPage) {
        book.setCurrentPage(currentPage);
        System.out.println(book.getTitle() + " kitabını okuyor..." + " Şuan kitabın " + book.getCurrentPage() + ". sayfasında!" + "\n**********************************");
    }

    public void printInfo() {
        System.out.println("Okuyucu Bilgileri : " + "\n Adı : " + getName() + "\n Yaşı : " + getAge() + "\n Cinsiyeti : " + getSex());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
