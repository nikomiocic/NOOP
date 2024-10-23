package pckg_Strategy_Pattern;

public class noFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("cant fly");
    }
}
