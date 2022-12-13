package net.wuxianjie;

public class SealedClass {

    // Not Allowed
//    public static final class Dog extends Animal {}

    public static final class Cat extends Animal {}

    public static sealed class Animal permits Cat {}
}
