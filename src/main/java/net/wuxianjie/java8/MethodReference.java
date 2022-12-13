package net.wuxianjie.java8;

import cn.hutool.core.convert.Convert;
import net.wuxianjie.java8.dto.Car;

import java.util.List;

public class MethodReference {

    public List<String> withoutMethodReference(List<Car> cars) {
        return cars.stream().map(car -> car.name()).toList();
    }

    public List<String> withMethodReference(List<Car> cars) {
        return cars.stream().map(Car::name).toList();
    }

    public static void main(String[] args) {
        MethodReference methodReference = new MethodReference();
        List<Car> cars = Car.generateFakeData();
        List<String> namesWithoutMethodReference = methodReference.withoutMethodReference(cars);
        System.out.println(Convert.toStr(namesWithoutMethodReference));

        List<String> namesWithMethodReference = methodReference.withMethodReference(cars);
        System.out.println(Convert.toStr(namesWithMethodReference));
    }
}
