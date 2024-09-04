package lambdas;

import java.util.function.UnaryOperator;

public class Calculator {

    public double recursive(Double x, int n, UnaryOperator<Double> f) {

        while (n != 1) {
            x = f.apply(x);

            return recursive(x, n - 1, f);
        }
        return x;
    }

    public double calculate(Double x, int n, UnaryOperator<Double> g) {

        for (int i = 0; i < n-1; i++) {

            x = g.apply(x);
        }

        return x;
    }



    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.recursive(3.0, 3, a -> Math.pow(2,a)));
        System.out.println(calc.calculate(3.0, 3, a -> a * a));
    }


}
