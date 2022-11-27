package lesson2;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(sum(1, 2));
        System.out.println(sub(1.2, 3.4));
        System.out.println(mul(12345, 12345));
        System.out.println(div(12.34, 56.78));
    }

    static int sum(int a, int b) {

        return a + b;
    }

    static double sum(double a, double b) {

        return a + b;
    }

    static long sum(long a, long b) {

        return a + b;
    }

    static int sub(int a, int b) {

        return a - b;
    }

    static double sub(double a, double b) {

        return a - b;
    }

    static long sub(long a, long b) {

        return a - b;
    }

    static int mul(int a, int b) {

        return a * b;
    }

    static double mul(double a, double b) {

        return a * b;
    }

    static long mul(long a, long b) {

        return a * b;
    }

    static double div(int a, int b) {

        return (a * 1.0 / b);
    }

    static double div(double a, double b) {

        return a / b;
    }

    static double div(long a, long b) {

        return (a * 1.0 / b);
    }
}


