package pckg_Kalkulator;

public class CalcClientSIM {
        private Operation operation;

        public CalcClientSIM(Operation operation) {
            this.operation = operation;
        }

        public void setOperation(Operation operation) {
            this.operation = operation;
        }

        public double executeOperation(double a, double b) {
            return operation.calculate(a, b);
        }
}

