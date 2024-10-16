package pckg_drugi_sat;

public class TestApp {
    public static void main(String[] args) {
        String fst = "Some fist string";
        String snd = "Some second string";

        CompareTWO <String> compareTWO = new CompareTWO<>(fst, snd);
//        compare.compareTwo();

        User usr1 = new User("niko");
        User usr2 = new User("Sanja");

        CompareTWO <User> compareTWOUser = new CompareTWO<User>(usr1, usr2);
        compareTWOUser.compareTwo();

    }
}
