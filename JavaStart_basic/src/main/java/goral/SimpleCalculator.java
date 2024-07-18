package goral;

public class SimpleCalculator {

    double a = 0.487;
    double b = 2.31;
    double c = 1.7;
    double result1 = (a + b) * c;
    double result2 = a - b / c;

    public void calculatorWriter(){
        System.out.println("(a + b) * c" +result1);
        System.out.println("a - b / c" + result2);

        System.out.println("Czy a + b > c? " + ((a + b) > c));
        System.out.println("Czy a = b? " + (a == b));
    }



}
