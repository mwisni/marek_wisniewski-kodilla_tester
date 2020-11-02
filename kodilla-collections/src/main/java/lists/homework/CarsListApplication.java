package lists.homework;

import arrays.homework.CarUtils;
import homework.Car;
import homework.Ford;
import homework.Opel;
import homework.Skoda;

import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {

        List<Car> cars = new LinkedList<>();
        Ford ford = new Ford(60, 40);
        cars.add(new Skoda(15,50));
        cars.add(new Opel(10, 60));
        cars.add(ford);

        cars.remove(1);
        cars.remove(ford);
        System.out.println(cars.size());
        for (Car car : cars) {
            // nie mogę dodać metody describeCar z CarUtils, dlatego metoda getSpeed jako zamiennik.
            CarUtils.describeCar(car);

        }

    }
}
