package pckg_wildcard;

import java.util.List;

public class AUX_CLS {

    public static void nestoNesto(List<? extends UserSND> usr){
    }



    public static void nestiN(List<? super UserSND> users){
        users.add(new UserSND("sime"));
    }

    public static <T extends UserSND> void processList(List<T>lst,  T newElement){
        for (T el : lst){
            System.out.println("element");
        }
        lst.add(newElement);
    }
}
