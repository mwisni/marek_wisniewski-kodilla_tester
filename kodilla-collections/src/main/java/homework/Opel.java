package homework;

public class Opel implements Car {

    private int speed = 0;
    private int increaseSpeed = 25;
    private int decreaseSpeed = 20;

    @Override
    public int getSpeed() {
        return speed;

    }

    @Override
    public void increaseSpeed() {
        speed += increaseSpeed;


    }

    @Override
    public void decreaseSpeed() {
        speed -= decreaseSpeed;

    }
}
