package homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford(80, 15,10);
        doRace(ford);
        Opel opel = new Opel(90, 30, 25);
        doRace(opel);
        Skoda skoda = new Skoda(100, 40, 30);
        doRace(skoda);
    }
// Tutaj powinna być 3 razy wywołana metoda increaseSpeed i 2 razy decreaseSpeed
    private static void doRace (Car car){
        car.increaseSpeed();
        car.decreaseSpeed();
    }

}
