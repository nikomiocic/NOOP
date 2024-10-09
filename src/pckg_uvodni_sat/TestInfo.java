package pckg_uvodni_sat;

import java.util.ArrayList;

public class TestInfo {
    public static void main(String[] args) {

        ArrayList<User> lst = new ArrayList<>();
//        lst.add(100);
//        lst.add("pas");
//        lst.add(100.298364);
//        lst.add(2E78);
        lst.add(new User("zoki"));

//        listElements(lst);
        listElementFromList(lst);
        System.out.println(new User("Nikoslav"));
    }

    private static void listElements(ArrayList lista){
        int lngth = lista.size();
        for (int k = 0; k<lngth; k++){
            System.out.println("Element: " + lista.get(k));
        }

    }

    private static void listElementFromList(ArrayList<User> lst){
        for (User user : lst){
            System.out.println(user);

        }
    }
}
