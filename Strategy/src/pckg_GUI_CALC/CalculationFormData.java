package pckg_GUI_CALC;

public record CalculationFormData(double fst, double scn, double result, CalculationStrategy calculationStrategy ) {
    @Override
    public String toString() {
        return "CalculationFormData{" +
                "fst=" + fst +
                ", scn=" + scn +
                ", result=" + result +
                ", calculationStrategy=" + calculationStrategy +
                '}';
    }
}
