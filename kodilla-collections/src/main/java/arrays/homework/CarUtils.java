package arrays.homework;

import homework.Car;
import homework.Ford;
import homework.Opel;
import homework.Skoda;

public class CarUtils {


    public static void describeCar(Car car){
        System.out.println("------------------------");
        System.out.println("Car name: " + getCarName(car) );
        System.out.println("Car speed after increase: " + car.getSpeed());
    }

    private static String getCarName(Car car){
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Skoda)
            return "Skoda";
        else
            return "Unknown Car name";
    }

}
