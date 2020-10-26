package homework;

public class Ford implements Car{


    private int speed = 0;
    private int increaseSpeed = 15;
    private int decreaseSpeed = 10;

    public Ford(int increaseSpeed, int speed) {
        this.increaseSpeed = increaseSpeed;
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
        return speed += increaseSpeed;
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
