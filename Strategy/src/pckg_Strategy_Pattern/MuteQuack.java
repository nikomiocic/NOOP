package pckg_Strategy_Pattern;

public class MuteQuack implements Qackable{
    @Override
    public void quack() {
        System.out.println("cant quack");
    }
}
