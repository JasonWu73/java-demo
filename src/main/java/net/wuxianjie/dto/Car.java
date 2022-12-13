package net.wuxianjie.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private int kilometer;

    public Car() {
    }

    public Car(String name, int kilometer) {
        this.name = name;
        this.kilometer = kilometer;
    }

    public static List<Car> generateFakeData() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", 4000));
        cars.add(new Car("Car2", 5000));
        cars.add(new Car("Car3", 6000));
        return cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKilometer() {
        return kilometer;
    }

    public void setKilometer(int kilometer) {
        this.kilometer = kilometer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return kilometer == car.kilometer && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kilometer);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", kilometer=" + kilometer +
                '}';
    }
}
