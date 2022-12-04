package lesson3.Task2;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("green", "kia", 1500);

        System.out.println(car1);

        Car car2 = new Car("yellow", "toyota", 1600);

        System.out.println(car2);

        Car car3 = new Car("red");

        System.out.println(car3);

        Car car4 = new Car("purple", 1550);

        System.out.println(car4);

        Car car5 = new Car();

        System.out.println(car5);


    }

}
