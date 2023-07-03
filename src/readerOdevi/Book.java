package readerOdevi;

public class Book {
    Author author;
    String title;
    int pageCount;
    String type;
    String hardCover;
    int currentPage;


    public Book(Author author, String title, int pageCount, String type, String hardCover, int currentPage) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.type = type;
        this.hardCover = hardCover;
        this.currentPage = currentPage;
    }

    public Book() {
        this("", 0, "", "", 0);
    }

    public Book(String title, int pageCount, String type, String hardCover, int currentPage) {
        this(new Author("Geoge Orwell"), title, pageCount, type, hardCover, currentPage);
    }

    public Book(Author author, String title, int pageCount) {
        this(new Author(author.name), title, pageCount, "Edebiyat", "Karton Kapak", 0);
    }

    public void bookInfo() {
        System.out.println("Kitap Bilgileri : \nKitap Adı : " + getTitle() + "\nKitabın Yazar : " + getAuthor().getName() + "\nKitabın Sayfa Sayısı : " + getPageCount() + "\nKitabın Türü : " + getType() + "\nKitabın Kapağı : " + getHardCover() + "\nOkunulan sayfa saysı : " + getCurrentPage());
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHardCover() {
        return hardCover;
    }

    public void setHardCover(String hardCover) {
        this.hardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
