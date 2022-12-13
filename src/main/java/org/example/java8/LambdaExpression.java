package org.example.java8;

import cn.hutool.core.convert.Convert;
import org.example.java8.dto.Car;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpression {

    public List<Car> findCarsOldWay(List<Car> cars) {
        List<Car> selectedCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.kilometer() < 5_000) {
                selectedCars.add(car);
            }
        }
        return selectedCars;
    }

    public List<Car> findCarsUsingLambda(List<Car> cars) {
        return cars.stream().filter(car -> car.kilometer() < 5_000)
                .toList();
    }

    public static void main(String[] args) {
        LambdaExpression lambdaExpression = new LambdaExpression();
        List<Car> cars = generateFakeData();
        List<Car> carsOldWay = lambdaExpression.findCarsOldWay(cars);
        System.out.println(Convert.toStr(carsOldWay));

        List<Car> carsUsingLambda = lambdaExpression.findCarsUsingLambda(cars);
        System.out.println(Convert.toStr(carsUsingLambda));
    }

    private static List<Car> generateFakeData() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Car1", 4000));
        cars.add(new Car("Car2", 5000));
        cars.add(new Car("Car3", 6000));
        return cars;
    }
}
