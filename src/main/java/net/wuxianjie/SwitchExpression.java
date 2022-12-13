package net.wuxianjie;

public class SwitchExpression {

    public static void oldSwitchStatement(int code) {
        switch (code) {
            case 0:
                System.out.println(code + " is stdin");
                break;
            case 1:
                System.out.println(code + " is stdout");
                break;
            case 2:
                System.out.println(code + " is stderr");
                break;
            default:
                System.out.println("unknown code " + code);
        }
    }

    public static void newSwitchStatement(int code) {
        switch (code) {
            case 0 -> System.out.println(code + " is stdin");
            case 1 -> System.out.println(code + " is stdout");
            case 2 -> System.out.println(code + " is stderr");
            default -> System.out.println("unknown code " + code);
        }
    }

    public static int switchYield(int code) {
        return switch (code) {
            case 0 -> {
                System.out.println(code + " is stdin");
                yield 0;
            }
            case 1 -> {
                System.out.println(code + " is stdout");
                yield 1;
            }
            case 2 -> {
                System.out.println(code + " is stderr");
                yield 2;
            }
            default -> {
                System.out.println("unknown code " + code);
                yield code;
            }
        };
    }

    public static void main(String[] args) {
        int code = 1;
        oldSwitchStatement(code);

        newSwitchStatement(code);

        int i = switchYield(code);
        System.out.println("yield: " + i);
    }
}
