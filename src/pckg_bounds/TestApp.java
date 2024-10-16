package pckg_bounds;

public class TestApp {
    public static void main(String[] args) {
        Integer [] ints= {1, 2, 3, 4, 5};
        BestUser [] users = {new BestUser("best user"), new BestUser("user"), new BestUser("new user")};
        SimpleCLS<BestUser> bestUserSimpleCLS = new SimpleCLS<BestUser>(users);
        bestUserSimpleCLS.performSomething();
        SimpleCLS<NewUser> newUserSimpleCLS = new SimpleCLS<>();
        SimpleCLS<User> userSimpleCLS = new SimpleCLS<>();
        System.out.println("----------------------------");
        userSimpleCLS.performSomething();

    }
}
