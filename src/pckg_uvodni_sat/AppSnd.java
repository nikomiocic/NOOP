package pckg_uvodni_sat;

import java.util.ArrayList;

public class AppSnd {
    public static void main(String[] args) {
        ArrayList<String> lst1 = new ArrayList<>();
        ArrayList<Integer> lst2 = new ArrayList<>();
        ArrayList<User> lst3 = new ArrayList<>();
        lst3.add(new User("niko"));
        lst2.add(123456);
        lst1.add("vaza");
        AUX_CLS.listAllList(lst1);
        AUX_CLS.listAllList(lst2);
        AUX_CLS.listAllList(lst3);
    }
}
