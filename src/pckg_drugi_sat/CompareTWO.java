package pckg_drugi_sat;

public class CompareTWO <T extends Comparable<T>>{
    private T fst;
    private T snd;
     public CompareTWO(T fst, T snd){
         this.fst = fst;
         this.snd = snd;
     }

     public void compareTwo(){
         if (fst.compareTo(snd) > 0){
             System.out.println("fist one is larger");
         }else if (fst.compareTo(snd) < 0){
             System.out.println("first one is smaller");

         }else {
             System.out.println("they are even");
         }
     }
}
