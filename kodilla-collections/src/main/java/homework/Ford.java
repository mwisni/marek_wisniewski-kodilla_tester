package homework;

public class Ford implements Car{


    private int speed;
    private int increaseSpeed;
    private int decreaseSpeed;

    public Ford (int speed, int increaseSpeed, int decreaseSpeed){
        this.speed = speed;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
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
