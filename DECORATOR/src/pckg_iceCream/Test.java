package pckg_iceCream;

public class Test {
    public static void main(String[] args) {
        Chocolate ch1 = new Chocolate("Chocolate", 2.0, 2);
        ch1.calculatePrice();
        ch1.description();
        HoneyOverflow honeyOverflow = new HoneyOverflow("HoneyOverflow", 0.5, 1, ch1);
        double finalPrice = honeyOverflow.decoratedPrice();
        System.out.println("Final Price: " + finalPrice);
    }
}
