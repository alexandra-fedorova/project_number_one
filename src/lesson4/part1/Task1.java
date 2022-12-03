package lesson4.part1;

public class Task1 {

    public static void main(String[] args) {

        odds(100);
    }

    public static void odds(int x) {

        Integer[] intArray = new Integer[x];

        for (int i = 0; i < intArray.length; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }

}





