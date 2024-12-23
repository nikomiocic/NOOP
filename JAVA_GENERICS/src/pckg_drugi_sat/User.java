package pckg_drugi_sat;

public class User implements Comparable<User> {
    private int id;
    private static int cntID;
    private String name;

    public  User(String name){
        this.name = name;
        this.id = cntID++;
    }
    public int getId(){
        return this.id;
    }


    @Override
    public int compareTo(User o) {
        int resoult;
        if (this.name.length() > o.name.length()){
            System.out.println("veci po duljini imena prvi je veci");
            resoult = 1;
        } else if (this.name.length() < o.name.length()) {
            System.out.println("veci po duljini imena prvi je manji");
            resoult = 2;
        }else {
            System.out.println("jednaki");
            resoult = 0;
        }
        return resoult;
    }
}

