package PCKG_Caommand_Problem;

import java.util.ArrayList;

public class RemoveElement<E> implements Command<E>{

    private ArrayList<E> list;
    private E element;
    private boolean flag;
    public  RemoveElement(ArrayList<E> list, E element) {
        this.element = element;
        this.list = list;
        this.flag = false;
    }
    @Override
    public void runCommand() {
        if (list.contains(element)){
            flag = list.remove(element);
            System.out.println("element je izbacen" + element.getClass().getSimpleName());
        }else {
            System.out.println("nema se sto izbaciti");
        }
    }

    @Override
    public void undoCommand() {
        if (flag){
            list.add(element);
            System.out.println("undo");
            flag = false;
        }else {
            System.out.println("nothing to undo");
        }
    }
    @Override
    public String toString() {
        return "Command class:" + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
