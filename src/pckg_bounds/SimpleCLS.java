package pckg_bounds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleCLS <T extends User>{
    private final List<T> users;
    public SimpleCLS(){
        this.users = Arrays.asList();
    }
    public SimpleCLS(T[] arrUsers){
        this.users = (List<T>) Arrays.asList(arrUsers);
    }
    public void performSomething(){
        if (users.isEmpty()){
            System.out.println("nema");
        }else{
            for (T user : users){
                user.preformeSomething();
            }
        }
    }
}
