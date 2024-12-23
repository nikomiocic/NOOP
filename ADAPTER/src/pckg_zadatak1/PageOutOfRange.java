package pckg_zadatak1;

public class PageOutOfRange extends Exception {

    private static final String MSG = "nema dovoljni stranica";

    public PageOutOfRange(){
        super(MSG);
    }
}
