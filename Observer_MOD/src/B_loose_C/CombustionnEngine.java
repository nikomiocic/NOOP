package B_loose_C;

public class CombustionnEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Strating: "+ getClass().getSimpleName() + "engine!");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + " stopped!");
    }
}
