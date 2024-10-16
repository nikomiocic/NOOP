package pckg_drugisat2;

import java.util.ArrayList;
import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        List<Integer> lst2 = List.of(1,2,3,4,5,6);
        MultiListCLS <Integer> lstInt = new MultiListCLS<>();
        List<Integer> lst3 = List.of(23,34,56,78);

        lstInt.compareTwoList(lst2);

    }
}
