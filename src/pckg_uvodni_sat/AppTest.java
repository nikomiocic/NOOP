package pckg_uvodni_sat;

import java.util.HashMap;

public class AppTest {
    public static void main(String[] args) {
        HashMap<Integer, String> mapIntStr = new HashMap<>();
        HashMap<User, String> mapUseStr = new HashMap<>();
        mapUseStr.put(new User("niko"), "neki opis");
        mapUseStr.put(new User("nik22o"), "neki22 opis");
        mapIntStr.put(100,"pet");
        mapIntStr.put(100,"pet");
        AUX_CLS.listMapElement(mapIntStr);
        System.out.println("-----------------------------------------------------------");
        AUX_CLS.listMapElement(mapUseStr);
    }
}
