package pckg_GUI_CALC;

public class DivCalcStrategy implements CalculationStrategy {
    @Override
    public double performCalculation(double fst, double sec) {
        if (sec==0){
            System.out.println("Dijeljenje sa nulom nije moguce!!!!!!");
            throw new ArithmeticException("zero division");
        }else{
            return fst/sec;
        }
    }

    @Override
    public String toString() {
        return "DivCalcStrategy";
    }
}
