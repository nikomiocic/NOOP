package pckg_bounds;

public class User extends Person {

    private int id;
    private static int cntId = 10;

    protected User(String name) {
        super(name);
        this.id = cntId++;
    }

    public void preformeSomething(){
        System.out.println(getClass().getSimpleName() + "nesto jednostavno radi");
    }

    @Override
    public void someMethod(String content) {

    }
}
