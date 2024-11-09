package app.models;

public class Calculator {

    public static final double infinity = Double.POSITIVE_INFINITY;

    public double sum(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b == 0){
            return a * infinity;
        }
        return a / b;
    }

}
