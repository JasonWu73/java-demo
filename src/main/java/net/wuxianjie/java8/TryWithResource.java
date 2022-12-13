package net.wuxianjie.java8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class TryWithResource {

    public void closeResourceByManually() {
        BufferedReader bufferedReader = new BufferedReader(new StringReader("Hello World 手动释放占用的资源"));
        try {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void closeResourceAutomatically() {
        try (BufferedReader bufferedReader = new BufferedReader(new StringReader("Hello World 自动释放占用的资源"))) {
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TryWithResource tryWithResource = new TryWithResource();
        tryWithResource.closeResourceByManually();

        tryWithResource.closeResourceAutomatically();
    }
}
