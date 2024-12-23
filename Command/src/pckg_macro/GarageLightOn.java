package pckg_macro;

public class GarageLightOn implements Command{
    @Override
    public void run() {
        System.out.println("garage light is on!!");
    }

    @Override
    public void undo() {
        System.out.println("garage light is off!!");
    }
}
