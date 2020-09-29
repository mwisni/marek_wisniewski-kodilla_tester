package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct){
            System.out.println("Metoda Sum działa poprawnie dla liczb " + a + " i " + b);
        }else
            System.out.println("Metoda Sum nie działa poprawnie dla liczb " + a + " i " + b);

        int subtractResult = calculator.subtract(b, a);

        boolean correctSubtract = ResultChecker.assertEquals(3, subtractResult);
        if (correctSubtract){
            System.out.println("Metoda Subtract działa poprawnie dla liczb " + b + " i " + a);
        }else
            System.out.println("Metoda Subtract nie działa poprawnie da liczb " + b + " i " + a);

        int increaseResult = calculator.increase(a);

        boolean correctIncrease = ResultChecker.assertEquals(25, increaseResult);
        if (correctIncrease){
            System.out.println("Metoda increase działa dla liczby " + a);
        }else
            System.out.println("Metoda increase nie działa dla liczby " + a);
    }
}
