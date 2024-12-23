package pckg_Strategy_Pattern;

public class RubberDuck extends Duck{
    @Override
    protected void display() {
        System.out.println("Display for: "+ getClass().getSimpleName());
    }

    @Override
    protected void swim() {
        System.out.println("Floating");
    }
}
// koristenjem strategy napraviti kalkulator koji ce podrzavati osnovne operacije(+,-,/,*)