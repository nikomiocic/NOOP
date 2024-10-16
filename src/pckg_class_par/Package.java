package pckg_class_par;

import java.util.ArrayList;

public class Package <T>{

    private final ArrayList<T> pckgContent;
    private Class<T> classType;

    public Package(Class<T> type){
        this.pckgContent = new ArrayList<>();
        this.classType = type;
    }
//    public void setPckgContent(ArrayList<T> content){
//        this.pckgContent=content;
//    }
    public void listPckg(){
        if (pckgContent.isEmpty()){
            System.out.println("nema nista u njij");
        }else {
            for (T element : pckgContent) {
                System.out.println(element);
            }

        }
    }
    public void addNewPckg(T pckgElement) {
        if (pckgContent.contains(pckgElement)) {
            System.out.println("vec sadrzi");
        } else {
            pckgContent.add(pckgElement);
            System.out.println("unesen je");
        }
    }
}
