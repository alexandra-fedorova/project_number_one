package lesson4.part1;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        sum();

    }

    public static void sum() {

        Integer[] numbers = new Integer[3];

        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        numbers[0] = s.nextInt();
        System.out.print("Введите второе число: ");
        numbers[1] = s.nextInt();
        System.out.print("Введите третье число: ");
        numbers[2] = s.nextInt();

        boolean sumResult = false;
        if (numbers[2] == numbers[0] + numbers[1]) {
            sumResult = true;
            System.out.println("Результат: " + sumResult);
        } else {
            System.out.println("Результат: " + sumResult);
        }
    }

}
