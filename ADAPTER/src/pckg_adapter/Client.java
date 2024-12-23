package pckg_adapter;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Iterator;

public class Client<E> {

    private Iterator<E> iterator;

    public Client(Iterator<E> iterator){
        this.iterator = iterator;

    }
    public  void someInfo(){
        while (iterator.hasNext()){
            System.out.println("element info:" + iterator.next());
            
        }
    }
    public  void removeFetchedInfo(){
        if (iterator.hasNext()){
            E element = iterator.next();
            System.out.println("feched: " + element);
            iterator.remove();
            System.out.println("feched recovered.....");

        }
    }
}
