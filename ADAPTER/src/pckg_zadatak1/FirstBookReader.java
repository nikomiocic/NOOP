package pckg_zadatak1;

public class FirstBookReader implements BookReader {

    private Book book;
    private int currentPage;
    private int numPages;
    private static final int MINI = 150;
    private static final int MAXI = 50;
    private int zoom;

    public FirstBookReader(){
        System.out.println("book reader is ready");
    }

    public void setBook(Book book) {
        this.book = book;
        this.currentPage = 1;
        this.numPages = book.getTotalPages();
        this.zoom = 100;
        System.out.println(book);
        System.out.println("--------------------------");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "FirstBookReader{" +
                "currentPage=" + currentPage +
                ", numPages=" + numPages +
                ", zoom=" + zoom +
                '}';
    }

    @Override
    public void viewPage(int page) throws PageOutOfRange {
        if (book != null){
            if (page <= numPages){
                this.currentPage = page;
                System.out.println("we are on the " + currentPage);
            }else{
                throw new PageOutOfRange();
            }
        }

    }

    @Override
    public void nextPage() {
        if (book != null) {
            if (currentPage < numPages){
                this.currentPage++;
                System.out.println("we are on next page");
            }else {
                System.out.println("this is last page");
            }
        }
    }

    @Override
    public void previousPage() {
        if (book != null) {
            if (currentPage > 1){
                this.currentPage--;
                System.out.println("we are on previous page");
            }else {
                System.out.println("this is first page");
            }
        }

    }

    @Override
    public int activePage() {
        return this.currentPage;
    }

    @Override
    public void goToLastPage() {
        if (book != null){
            this.currentPage = numPages;
            System.out.println("this is last page");
        }

    }

    @Override
    public void goToFirstPage() {
        if (book!= null){
            this.currentPage = 1;
            System.out.println("this is first page");
        }

    }

    @Override
    public void zoom(int percentage) {
        if (book != null){
            if (percentage <= MAXI && percentage >= MINI){
                this.zoom = percentage;
                System.out.println("new zoom + " + percentage);
            }else {
                System.out.println("wrong percentage for zoom");
            }

        }

    }
}
