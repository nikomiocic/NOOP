package pckg_bounds;

public class BestUser extends User{
    protected BestUser(String name) {
        super(name);
    }

    @Override
    public void preformeSomething() {
        super.preformeSomething();
        System.out.println("ovo moze raditi nesto dodatno ali bolje" + getClass().getSimpleName());
    }
}
