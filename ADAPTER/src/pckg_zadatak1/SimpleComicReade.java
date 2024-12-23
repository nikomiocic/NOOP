package pckg_zadatak1;

import javax.swing.text.html.MinimalHTMLWriter;

public class SimpleComicReade implements ComicReader {

    private Comic comic;
    private int currentPage;
    private int totalPages;
    private static final int MINI = 200;
    private static final int MAXI = 20;
    private int zoom;
    private boolean nightReading;

    public SimpleComicReade(){
        System.out.println("ready to read some comics");
        System.out.println("please provide some comics to read!");
        this.nightReading = false;
    }

    public void setComic(Comic comic) {
        this.comic = comic;
        this.currentPage = 1;
        this.totalPages = comic.getTotalPages();
        this.zoom = 100;
        System.out.println("Reading this: ");
        System.out.println(comic);
        System.out.println("----------------------------------");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "SimpleComicReade{" +
                "currentPage=" + currentPage +
                ", totalPages=" + totalPages +
                ", zoom=" + zoom +
                ", nightReading=" + nightReading +
                '}';
    }

    @Override
    public void goToPage(int numPage) throws PageOutOfRange {
        if (comic !=null){
            if (numPage <= totalPages){
                this.currentPage = numPage;
                System.out.println("we are on the page: " + numPage );
            }else {
                throw new PageOutOfRange();
            }
        }
    }

    @Override
    public void next() {
        if (comic != null) {
            if (currentPage < totalPages) {
                this.currentPage++;
                System.out.println("new page: " + currentPage);
            } else {
                System.out.println("last page opened");
            }
        }
    }

    @Override
    public int currentPage() {
        return currentPage;
    }

    @Override
    public void previous() {
        if (comic != null){
            if (currentPage == 1){
                System.out.println("cant go on previous");
            }else{
                this.currentPage--;
                System.out.println("previous: " + currentPage);
            }
        }

    }

    @Override
    public void last() {
        if (comic != null){
            this.currentPage = totalPages;
            System.out.println("this is last page");
        }

    }

    @Override
    public void first() {
        if (comic != null){
            this.currentPage = 1;
            System.out.println("this is first page");
        }

    }

    @Override
    public void zoom(int percent) {
        if (comic != null){
            if (percent <= MAXI && percent >= MINI){
                this.zoom = percent;
                System.out.println("new zoom + " + percent);
            }else {
                System.out.println("wrong percentage for zoom");
            }

        }

    }

    @Override
    public void nightReadingMode(boolean status) {
        if(comic != null){
            nightReading = status;
            System.out.println("night mode is on:" + nightReading);
        }
    }
}
