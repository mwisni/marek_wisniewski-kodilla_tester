package homework;

public class Skoda implements Car {

    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Skoda (int speed, int increaseSpeed, int decreaseSpeed){
        this.speed = speed;
        this.decreaseSpeed = decreaseSpeed;
        this.increaseSpeed = increaseSpeed;

    }

    @Override
    public int getSpeed() {
        return speed;

    }

    @Override
    public void increaseSpeed() {
        System.out.println(speed + increaseSpeed);
    }

    @Override
    public void decreaseSpeed() {
        System.out.println(speed - decreaseSpeed);
    }
}
