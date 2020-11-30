import pl.kodilla.zadanie2_8.UserDialogs;

public class Calculator {
    static final double PI = 3.1415927;
    static int counter = 0;



    public Calculator(){
        counter++;
    }

    public double add (double a, double b){
        return a + b;
    }

    public double sub (double a, double b){
        return a - b;
    }
    public double circleArea (double r){
        String name = UserDialogs.getUsername();
        System.out.println("Hi " + name);
        return PI * r * r;
    }

    public double circlePermiter (double r){
        return 2 * PI * r;
    }

    public static class CalcApplication {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();

            double area = calculator.circleArea(10);
            System.out.println("pole wynosi " + area);

            double p = PI;
            System.out.println("Wartość PI wynosi " + p);

            Calculator calculator2 = new Calculator();
            System.out.println(calculator2.counter);


        }
    }
}
