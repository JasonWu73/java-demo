package net.wuxianjie.java8;

import java.util.Date;

public class DefaultMethod {

    interface Logging {
        void log(String message);

        default void log(String message, Date date) {
            System.out.println(date.toString() + ": " + message);
        }
    }

    static class LoggingImplementation implements Logging {

        @Override
        public void log(String message) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        LoggingImplementation loggingImplementation = new LoggingImplementation();
        loggingImplementation.log("我是测试内容");

        loggingImplementation.log("我是包含日期的测试内容", new Date());
    }
}
