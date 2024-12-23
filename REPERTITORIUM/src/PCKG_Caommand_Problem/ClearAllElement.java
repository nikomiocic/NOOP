package PCKG_Caommand_Problem;

import java.util.ArrayList;

public class ClearAllElement<E> implements Command<E>{
    private ArrayList<E> list;
    private final ArrayList<E> copyList;

    public ClearAllElement(ArrayList<E> list ){
        this.list = list;
        this.copyList = new ArrayList<>();
    }

    @Override
    public void runCommand() {
        if(list.isEmpty()){
            System.out.println("list is empty");
        }else {
            copyList.addAll(list);
            list.clear();
            System.out.println("lista je izbrisana");
        }
    }

    @Override
    public void undoCommand() {
        if (copyList.isEmpty()){
            System.out.println("nema nistaza undo");
        }else {
            list.addAll(copyList);
            copyList.clear();
            System.out.println("lista je vracena");
        }
    }
    @Override
    public String toString() {
        return "Command class:" + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
