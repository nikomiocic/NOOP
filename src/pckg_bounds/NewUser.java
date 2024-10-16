package pckg_bounds;

public class NewUser extends User{
    protected NewUser(String name) {
        super(name);
    }

    @Override
    public void preformeSomething() {
        super.preformeSomething();
        System.out.println(getClass().getSimpleName() + "radi nesto novo");
    }
}
