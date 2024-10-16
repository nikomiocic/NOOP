package pckg_uvodni_sat;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class AUX_CLS {

    public static <E> void listAllList(ArrayList<E> someList){
        if (someList.isEmpty()){
            System.out.println("nema nista u njij");
        }else {
            for (E element : someList) {
                System.out.println(element);
            }

        }
    }
    public static <Q> void listElementsVerSnd(ArrayList<Q> someList){
        Iterator <Q> iter = someList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()
            );
        }

    }
    public static<K, V> void listMapElement(HashMap<K, V> map) {
        if (map.isEmpty()) {
            System.out.println("prazma je");
        } else {
            System.out.println(Integer.toHexString(map.hashCode()));
            for (Map.Entry<K, V> entry : map.entrySet()) {
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
    }

}
