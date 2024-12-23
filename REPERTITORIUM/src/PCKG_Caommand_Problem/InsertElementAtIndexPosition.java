package PCKG_Caommand_Problem;

import java.util.ArrayList;

public class InsertElementAtIndexPosition<E> implements Command<E>{
    private ArrayList<E> list;
    private E element;
    private int index;

    public InsertElementAtIndexPosition(ArrayList<E> list, E element, int idx){
        this.element = element;
        this.index = idx;
        this.list=list;
    }

    @Override
    public void runCommand() {
        if (index >= 0 && index < list.size()){
            if (list.contains(element)){
                System.out.println("Element i in list");
            }else {
                list.add(index, element);
                System.out.println("element added on "+ index + "el:" + element.getClass().getSimpleName());
            }
        }else {
            throw new IndexOutOfBoundsException("idneks je pre veliki ili pre mali");
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
