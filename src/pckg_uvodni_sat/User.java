package pckg_uvodni_sat;

public class User {

    private int id;
    private static int cntId = 100;

    private String name;

    public User(String name){
        this.name = name;
        id = cntId++;
    }
    public User(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{ " +
                "id = " + id +
                ", name = '" + name + '\'' +
                '}';
    }
}
