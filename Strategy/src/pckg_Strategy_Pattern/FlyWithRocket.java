package pckg_Strategy_Pattern;

public class FlyWithRocket implements Flyable{
    @Override
    public void fly() {
        System.out.println("flying using rockets");
    }
}
