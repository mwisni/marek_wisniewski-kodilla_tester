package homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford(12, 15);
        doRace(ford);
        System.out.println("Ford speed is: " + ford.getSpeed());
        Opel opel = new Opel(25,15);
        doRace(opel);
        System.out.println("Opel speed is: " + opel.getSpeed());
        Skoda skoda = new Skoda(25, 100);
        doRace(skoda);
        System.out.println("Skoda speed is: " + skoda.getSpeed());
    }

    private static void doRace (Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
    }

}
