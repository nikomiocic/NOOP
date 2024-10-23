package pckg_Kalkulator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcClientSIM sim = new CalcClientSIM(new Zbrajanje());

        System.out.print("Unesi prvi broj: ");
        double num1 = scanner.nextDouble();

        System.out.print("Unesi drugi broj: ");
        double num2 = scanner.nextDouble();

        System.out.println("Odaberi operaciju:");
        System.out.println("1 - Zbrajanje");
        System.out.println("2 - Oduzimanje");
        System.out.println("3 - Množenje");
        System.out.println("4 - Dijeljenje");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                sim.setOperation(new Zbrajanje());
                break;
            case 2:
                sim.setOperation(new Oduzimanje());
                break;
            case 3:
                sim.setOperation(new Mnozenje());
                break;
            case 4:
                sim.setOperation(new Dijeljenje());
                break;
            default:
                System.out.println("Krivi odabir.");
                return;
        }

        double res = sim.executeOperation(num1, num2);
        System.out.println("Rezultat: " + res);

        scanner.close();
    }
}

