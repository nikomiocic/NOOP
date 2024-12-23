package B_loose_C;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Strarting: "+ getClass().getSimpleName() + "engine!");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " stopped!");
    }
}
