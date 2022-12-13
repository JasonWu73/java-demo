package net.wuxianjie;

import net.wuxianjie.dto.Car;

import java.util.List;

public class LocalTypeVar {

    public void explicitType() {
        Car car1 = new Car("Car1", 1000);
        Car car2 = new Car("Car2", 2000);

        List<Car> cars = List.of(car1, car2);

        for (Car car : cars) {
            System.out.println(car.getName() + ": " + car.getKilometer());
        }
    }

    public void varType() {
        var car1 = new Car("Car1", 1000);
        var car2 = new Car("Car2", 2000);

        var cars = List.of(car1, car2);

        for (var car : cars) {
            System.out.println(car.getName() + ": " + car.getKilometer());
        }
    }

    public static void main(String[] args) {
        LocalTypeVar localTypeVar = new LocalTypeVar();
        localTypeVar.explicitType();

        localTypeVar.varType();
    }
}
