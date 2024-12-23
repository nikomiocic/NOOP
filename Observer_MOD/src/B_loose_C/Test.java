package B_loose_C;

public class Test {

    public static void main(String[] args) {
        Car car1 = new Car(new ElectricEngine());
        car1.driveCar();
        Car car2 = new Car(new CombustionnEngine());
        car2.driveCar();
    }
}
