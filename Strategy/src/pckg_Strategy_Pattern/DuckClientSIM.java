package pckg_Strategy_Pattern;

public class DuckClientSIM {
    private Duck duck;

    public DuckClientSIM(){
        this.duck = new RubberDuck();
        duck.setFlyable(new FlyWithRocket());
        duck.setQuackable(new MuteQuack());
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    @Override
    public String toString() {
        return "DuckClientSIM{" +
                "duck=" + duck +
                '}';
    }
    public void startSimulation(){
        System.out.println("starting for:" + this.duck.getClass().getSimpleName());
        this.duck.display();
        this.duck.swim();
        this.duck.performFly();
        this.duck.performQuack();
    }
}
