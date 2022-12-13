package net.wuxianjie.java8.dto;

import java.util.ArrayList;
import java.util.List;

public record Car(String name, int kilometer) {
    public static List<Car> generateFakeData() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", 4000));
        cars.add(new Car("Car2", 5000));
        cars.add(new Car("Car3", 6000));
        return cars;
    }
}
