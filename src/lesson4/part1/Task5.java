package lesson4.part1;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        isThereThree();
    }

    public static void isThereThree() {

        Integer[] numbers = new Integer[5];

        Scanner s = new Scanner(System.in);
        System.out.println("Введите числа:");
        numbers[0] = s.nextInt();
        numbers[1] = s.nextInt();
        numbers[2] = s.nextInt();
        numbers[3] = s.nextInt();
        numbers[4] = s.nextInt();

        boolean isThree = false;
        if (numbers[0] == 3 || numbers[numbers.length - 1] == 3) {
            isThree = true;
            System.out.println("Результат: " + isThree);
        } else {
            System.out.println("Результат: " + isThree);
        }
    }
}


