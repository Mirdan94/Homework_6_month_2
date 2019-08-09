package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> car = new ArrayList<>();
        car.ensureCapacity(10);

        car.add(new Car("Mazda", 2002, 2.2));
        car.add(new Car("Toyota", 2003, 2));
        car.add(new Car("Lexus", 2005, 3));
        car.add(new Car("Honda", 2001, 2.1));
        car.add(new Car("Nisan", 2005, 2.4));
        car.add(new Car("Hundai", 1996, 2));
        car.add(new Car("Mizubishi", 2010, 4));
        car.add(new Car("Tesla Model X", 2014, 3));
        car.add(new Car("Tesla Model S", 2013, 3.1));
        car.add(new Car("Tesla Model 3", 2017, 3.2));

        System.out.println("ДО");
        for (Car cars : car) {
            System.out.println(cars.getModel() + " " + cars.getModel() + " "
                    + cars.getYear());
        }
        System.out.println("--------------------------");
        System.out.println("ПОСЛЕ");
        Collections.sort(car);

        for (Car cars : car) {
            System.out.println(cars.getModel() + " " + cars.getModel() + " "
                    + cars.getYear());
        }
    }

}
