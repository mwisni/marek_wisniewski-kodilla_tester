package arrays.homework;

import homework.Car;
import homework.Ford;
import homework.Opel;
import homework.Skoda;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

        Car [] cars = new Car[15];
        for (int n = 0 ; n < cars.length; n++ )
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }


    public static Car drawCar(){
        Random random = new Random();
        int drawnCar = random.nextInt(3);
        int speed = random.nextInt(200) ;
        int increaseSpeed = random.nextInt(29);

        if (drawnCar == 0)
            return new Ford(speed, increaseSpeed);
        else if (drawnCar == 1)
            return new Opel(speed, increaseSpeed);
        else
            return new Skoda(speed, increaseSpeed);

    }


}
