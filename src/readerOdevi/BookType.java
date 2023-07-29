package readerOdevi;

public enum BookType {
    FICTION("Kurgu : Bu kitap hayal ürünü olarak kurgulanmıştır."), NON_FICTION("Kurgu dışı : Bu kitap gerçek olay ve durumlardan esinlenmiştir."),
    SCIENTIFIC("Bilimsel : Bilimsel verilere dayanan akademik çalışma."), LITERATURE("Edebiyat : Bu kitap edebi türlerden yararlanmıştır."), PHILOSOPHY("Felsefe"), DRAMA("Aşk ve Dram");

    private String description;

    BookType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
