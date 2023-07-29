package readerOdevi;

public class ReaderTest {
    public static void main(String[] args) {

        Author pauloCoelho = new Author("Paulo Coelho");
        Author antonCehov = new Author("Anton Çehov");
        Author doganCuceloglu = new Author("Doğan Cüceloğlu");
        Author stephenHawking = new Author("Stephen Hawking");

        Book simyaci = new Book(pauloCoelho, "Simyacı", 188, BookType.PHILOSOPHY, true, 0);
        Book elif = new Book(pauloCoelho, "Elif", 256, BookType.DRAMA, true, 0);
        Book hac = new Book(pauloCoelho, "Hac", 223, BookType.PHILOSOPHY, true, 0);
        Book marti = new Book(antonCehov, "Martı", 94, BookType.FICTION, false, 0);
        Book hayvanCiftligi = new Book("Hayvan Çiftliği", 152, BookType.LITERATURE, true, 0);
        Book papazinKizi = new Book("Papazın Kızı", 328, BookType.LITERATURE, false, 0);
        Book evlenmedenOnce = new Book(doganCuceloglu, "Evlenmeden Önce", 208);
        Book zamaninKisaTarihi = new Book(stephenHawking, "Zamanın Kısa Tarihi", 350, BookType.SCIENTIFIC, true, 0);


        Reader reader = new Reader("Emre", 31, "Erkek");
        Reader reader1 = new Reader("Onur", 28, "Erkek");
        Reader reader2 = new Reader("Yağmur", 25, "Kadın");
        reader.printInfo();
        reader.read(simyaci, 60);
        reader1.printInfo();
        reader1.read(hac, 70);
        reader2.printInfo();
        reader2.read(elif, 120);
        System.out.println("Yağmur'un okumakta olduğu " + elif.title + " romanının yazarı " + elif.getAuthor().getName() + "'dır. " + "Bu kitap " + elif.bookType.getDescription() + " türünde yazılmıştır." + " Ve bu kitap " + elif.pageCount + " sayfadır.");
        System.out.println("**********************************");
        evlenmedenOnce.bookInfo();
        System.out.println("**********************************");
        papazinKizi.bookInfo();
        System.out.println("**********************************");
        hayvanCiftligi.bookInfo();
        System.out.println("**********************************");
        marti.bookInfo();
        System.out.println("**********************************");
        marti.bookInfo();

    }
}
