package pckg_GUI_CALC;

public class SubCalcStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fst, double sec) {
        return fst - sec;
    }

    @Override
    public String toString() {
        return "SubCalcStrategy";
    }
}
