package lesson4.part1;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("Делится на три: ");
        divThree(100);
        System.out.println("Делится на пять: ");
        divFive(100);
        System.out.println("Делится на пять и три: ");
        divBoth(100);
    }

    public static void divThree(int x) {

        Integer[] intArray = new Integer[x];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(i);
        }

        for (int i = 0; i < intArray.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.print(i + ", ");
            }
        }

        System.out.println("\n");
    }

    public static void divFive(int x) {

        Integer[] intArray = new Integer[x];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(i);
        }

        for (int i = 0; i < intArray.length; i++) {
            if (i % 5 == 0 && i != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
    }

    public static void divBoth(int x) {

        Integer[] intArray = new Integer[x];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = Integer.valueOf(i);
        }

        for (int i = 0; i < intArray.length; i++) {
            if (i % 5 == 0 && i % 3 == 0 && i != 0) {
                System.out.print(i + ", ");
            }
        }
    }

}
