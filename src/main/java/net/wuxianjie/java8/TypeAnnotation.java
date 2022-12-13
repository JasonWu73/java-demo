package net.wuxianjie.java8;

import lombok.NonNull;

public class TypeAnnotation {

    public void print(@NonNull String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        TypeAnnotation typeAnnotation = new TypeAnnotation();
        typeAnnotation.print("旧消息");

        typeAnnotation.print(null);
    }
}
