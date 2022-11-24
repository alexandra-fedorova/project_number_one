package lesson2;

public class Calculator {

    public static void main(String[] args) {

        System.out.println(sum(1, 2));
        System.out.println(sub(1.2, 3.4));
        System.out.println(mul(12345, 12345));
        System.out.println(div(12.34, 56.78));
    }
    static int sum(int a, int b){

        int c = a + b;
        return c;
    }
    static double sum(double a, double b){

        double c = a + b;
        return c;
    }
    static long sum(long a, long b){

        long c = a + b;
        return c;
    }
    static int sub(int a, int b){

        int c = a - b;
        return c;
    }
    static double sub(double a, double b){

        double c = a - b;
        return c;
    }
    static long sub(long a, long b){

        long c = a - b;
        return c;
    }
    static int mul(int a, int b){

        int c = a * b;
        return c;
    }
    static double mul(double a, double b){

        double c = a * b;
        return c;
    }
    static long mul(long a, long b){

        long c = a * b;
        return c;
    }
    static int div(int a, int b){

        int c = a / b;
        return c;
    }
    static double div(double a, double b){

        double c = a / b;
        return c;
    }
    static long div(long a, long b){

        long c = a / b;
        return c;
    }
}


