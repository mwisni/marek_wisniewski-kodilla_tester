package homework;

public class Skoda implements Car {

    private int speed = 0;
    private int increaseSpeed = 27;
    private int decreaseSpeed = 13;

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
