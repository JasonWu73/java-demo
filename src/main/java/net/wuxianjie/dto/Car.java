package net.wuxianjie.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    private String name;
    private int kilometer;

    public static List<Car> generateFakeData() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", 4000));
        cars.add(new Car("Car2", 5000));
        cars.add(new Car("Car3", 6000));
        return cars;
    }
}
