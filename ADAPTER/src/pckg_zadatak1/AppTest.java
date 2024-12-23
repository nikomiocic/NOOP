package pckg_zadatak1;

public class AppTest {
    public static void main(String[] args) {
        Comic comic = new Comic("kapetan amerika", "neki tamo livi", 100);
        SimpleComicReade simpleComicReade = new SimpleComicReade();
        simpleComicReade.setComic(comic);
        Client client = new Client();
        client.setComicReader(simpleComicReade);
        client.skipToNextPage();
        client.giveMeThisPage(99);
        Book book = new Book("kniga", "autor", 70);
        FirstBookReader firstBookReader = new FirstBookReader();
        firstBookReader.setBook(book);
        BookToComicAdapter adapter = new BookToComicAdapter(firstBookReader);
        client.setComicReader(adapter);
        client.turnOnNightMode();
    }
}
