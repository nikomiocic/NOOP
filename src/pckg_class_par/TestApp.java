package pckg_class_par;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {
        Package<String> stringPackage = new Package<>(String.class);
        stringPackage.addNewPckg("novi");
        stringPackage.addNewPckg("novi");
        stringPackage.listPckg();
    }


}
