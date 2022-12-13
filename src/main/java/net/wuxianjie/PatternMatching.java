package net.wuxianjie;

public class PatternMatching {

    public static void makeNoise(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).bark();
            return;
        }

        if (animal instanceof Cat) {
            ((Cat) animal).meow();
        }
    }

    public static void makeNoiseNewWay(Animal animal) {
        if (animal instanceof Dog d) {
            d.bark();
            return;
        }

        if (animal instanceof Cat c) {
            c.meow();
        }
    }

    public static void main(String[] args) {
        makeNoise(new Dog());
        makeNoise(new Cat());

        makeNoiseNewWay(new Dog());
        makeNoiseNewWay(new Cat());
    }

    public static class Dog extends Animal {

        void bark() {
            System.out.println("狗叫什么!!!");
        }
    }

    public static class Cat extends Animal {

        void meow() {
            System.out.println("meow meow...");
        }
    }

    public static class Animal {
    }
}
