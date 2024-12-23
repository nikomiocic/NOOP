package pckg_zadatak1;

public class Client {

    private ComicReader comicReader;
    public Client(){
        System.out.println("some client that expects ComicReader");
    }

    public void setComicReader(ComicReader comicReader){
        this.comicReader = comicReader;
    }
    public void skipToNextPage(){
        comicReader.next();
    }
    public void SetToPreviousPage(){
        comicReader.previous();
    }
    public void giveMeLastPage(){
        comicReader.last();
    }
    public void giveMeFirstPage(){
        comicReader.first();
    }
    public void setSomeZoom(int percent){
        comicReader.zoom(percent);
    }
    public void turnOnNightMode(){
        comicReader.nightReadingMode(false);
    }
    public void giveMeThisPage(int page){
        try {
            comicReader.goToPage(page);
        } catch (PageOutOfRange e) {
            System.out.println(e.getMessage());
        }
    }
    public void giveMeCurrentPage(){
        System.out.println("this page is" + comicReader.currentPage());
    }

}
