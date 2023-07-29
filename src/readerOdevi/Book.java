package readerOdevi;

public class Book {
    Author author;
    String title;
    int pageCount;
    boolean hardCover;
    int currentPage;
    BookType bookType;

    public Book(Author author, String title, int pageCount, BookType bookType, boolean hardCover, int currentPage) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.bookType = bookType;
        this.hardCover = hardCover;
        this.currentPage = currentPage;

    }

    public Book() {
        this("", 0, BookType.NON_FICTION, true, 0);
    }

    public Book(String title, int pageCount, BookType bookType, boolean hardCover, int currentPage) {
        this(new Author("George Orwell"), title, pageCount, bookType, hardCover, currentPage);
    }

    public Book(Author author, String title, int pageCount) {
        this(new Author(author.name), title, pageCount, BookType.LITERATURE, true, 0);
    }

    public void bookInfo() {
        System.out.println("Kitap Bilgileri : \nKitap Adı : " + getTitle() + "\nKitabın Yazar : " + getAuthor().getName() + "\nKitabın Sayfa Sayısı : " + getPageCount() + "\nKitabın Türü : " + bookType.getDescription() + "\nKarton Kapak : " + isHardCover() + "\nOkunulan sayfa saysı : " + getCurrentPage());
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

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public boolean isHardCover() {

        return hardCover;
    }

    public void setHardCover(boolean hardCover) {
        this.hardCover = hardCover;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }
}
