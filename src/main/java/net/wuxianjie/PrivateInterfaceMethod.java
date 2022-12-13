package net.wuxianjie;

public class PrivateInterfaceMethod {

    public static void main(String[] args) {
        TestCalculator testCalculator = new TestCalculator();
        System.out.println(testCalculator.doCalculate());
    }

    public static class TestCalculator implements Calculator {
    }

    public interface Calculator {

        default int doCalculate() {
            return plus(10, 10);
        }

        private int plus(int i1, int i2) {
            return i1 + i2;
        }
    }
}
