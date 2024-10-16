package pckg_drugisat2;

import java.util.ArrayList;
import java.util.List;

public class MultiListCLS <E> {
    private final List <E> someList;

    public MultiListCLS (){
        this.someList = new ArrayList<>();
    }
    public MultiListCLS (List<E> someList){
        this.someList = someList;
    }
    public void listAllElements(){
        if (someList.isEmpty()){
            System.out.println("Lista je prazna");
        }else {
            for (E element : this.someList){
                System.out.println(element);
            }
        }
    }
    public void compareTwoList(List<?> anotherlist){
        System.out.println(this.someList.size() - anotherlist.size());

    }
}
