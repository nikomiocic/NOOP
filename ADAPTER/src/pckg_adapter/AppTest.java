package pckg_adapter;

import java.util.*;

public class AppTest {
    public static void main(String[] args) {
//        ArrayList<String> stringToList = new ArrayList<>();
//        stringToList.addAll(List.of("a", "b", "c", "d", "e"));
//        Client<String> clientFst = new Client<>(stringToList.iterator());
//        clientFst.someInfo();
//        clientFst.removeFetchedInfo();
//        System.out.println("after removal...");
//        clientFst.someInfo();
//        System.out.println(stringToList);
        Enumeration stringTokenizer = new StringTokenizer("this is dome string for tokenizer");
        AdapterEnumeration<String> adapterEnumeration = new AdapterEnumeration<>(stringTokenizer);

        Client<String> sndClient = new Client<>(adapterEnumeration);
        //sndClient.someInfo();
        sndClient.removeFetchedInfo();
        sndClient.someInfo();

    }
}
