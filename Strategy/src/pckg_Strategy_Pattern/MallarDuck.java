package pckg_Strategy_Pattern;

public class MallarDuck extends Duck{
    @Override
    protected void display() {
        System.out.println("Display for: "+ getClass().getSimpleName());
    }

    @Override
    protected void swim() {
        System.out.println("Swimming");
    }
}
