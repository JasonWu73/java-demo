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

    public static void main(String[] args) {
        oldSwitchStatement(1);

        newSwitchStatement(1);
    }
}
