package PCKG_Caommand_Problem;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("userName1");
        User user2 = new User("userName2");
        User user3 = new User("userName3");
        User user4 = new User("userName4");

        ArrayList<User> users = new ArrayList<>();

        Car car1 = new Car("meca", "slk");
        Car car2 = new Car("meca2", "slk2");
        Car car3 = new Car("meca3", "slk3");

        ArrayList<Car> cars = new ArrayList<>();

        ArrayListController alc = new ArrayListController();

        AddNewElementToList<User> add1 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> add2 = new AddNewElementToList<>(users, user1);
        AddNewElementToList<User> add3 = new AddNewElementToList<>(users, user2);
        InsertElementAtIndexPosition<User> insert1 = new InsertElementAtIndexPosition<>(users, user3, 1);
        ClearAllElement<User> clearAllElement = new ClearAllElement<>(users);

       AddNewElementToList<Car> addCar1 = new AddNewElementToList<>(cars, car1);



        alc.setCommand(add1);
        alc.runCommand();
        alc.setCommand(add2);
        alc.runCommand();
        alc.setCommand(add3);
        alc.runCommand();
        alc.setCommand(insert1);
        alc.runCommand();
        alc.setCommand(addCar1);
        alc.runCommand();
        alc.undoCommand();
        alc.undoCommand();
        alc.setCommand(clearAllElement);
        alc.runCommand();
        alc.undoCommand();
    }

    private static <E> void listElement(ArrayList<E> list){
        if (list.isEmpty()){
            System.out.println("lista je prazna");
        }else{
            System.out.println("nigggggggggggggggggggggggggggggggggggggggggggggggggggggggger");
            for (E element : list){
                System.out.println(element);
            }
        }
    }
}
