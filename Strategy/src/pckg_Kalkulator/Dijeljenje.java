package pckg_Kalkulator;

import static java.lang.System.*;

public class Dijeljenje implements Operation{
    @Override
    public double calculate(double a , double b) {

        if (b<0){
           throw new ArithmeticException("Nemoguce dijeljenje s nulom");

        }else{
            return  a/b;
        }
    }
}
