package lesson3.Task3;

public class Main {

    public static void main(String [] args) {

        house1();
        house2();
        System.out.println(howOld());

    }
    public static void house1() {

        House house = new House(5, 1915, "Cottage");

        System.out.println(house);

    }

    public static void house2() {

        House house = new House(56, 2015, "Skyscrapper");

        System.out.println(house);

    }

    public static String howOld() {

        House house3 = new House(1997);

        int yearNow = 2022;
        int howOld = yearNow - house3.getConstructionYear();
        return "С момента постройки прошло " + howOld + " лет";

    }

}
