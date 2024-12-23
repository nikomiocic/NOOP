package PCKG_Caommand_Problem;

import java.util.ArrayList;

public class AddNewElementToList<E> implements Command<E>{

    private ArrayList<E> list;
    private E element;


    public  AddNewElementToList(ArrayList<E> list, E element){
        this.element=element;
        this.list=list;
    }

    @Override
    public void runCommand() {
        if (element == null){
            System.out.println("nemoze se dodati jer je null");
        }else if (list.contains(element)){
            System.out.println("elemen je duplikat");
        }else{
            list.add(element);
            System.out.println("element je dodan u listu" + element.getClass().getSimpleName());
        }
    }

    @Override
    public void undoCommand() {
        if (list.contains(element)){
            list.remove(element);
            System.out.println("element was removed");
        }else {
            System.out.println("no element to undo");
        }
    }

    @Override
    public String toString() {
        return "Command class:" + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
