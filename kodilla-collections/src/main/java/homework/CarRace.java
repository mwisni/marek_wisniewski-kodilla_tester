package homework;

public class CarRace {

    public static void main(String[] args) {

        Ford ford = new Ford();
        doRace(ford);
        System.out.println("Ford speed is: " + ford.getSpeed());
        Opel opel = new Opel();
        doRace(opel);
        System.out.println("Opel speed is: " + opel.getSpeed());
        Skoda skoda = new Skoda();
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
