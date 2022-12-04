package lesson4.part1;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        incNums();
    }

    public static void incNums() {

        Integer[] numbers = new Integer[3];

        Scanner s = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        numbers[0] = s.nextInt();
        System.out.print("Введите второе число: ");
        numbers[1] = s.nextInt();
        System.out.print("Введите третье число: ");
        numbers[2] = s.nextInt();

        boolean isIncreasing = false;
        if (numbers[0] < numbers[1] && numbers[1] < numbers[2]) {
            isIncreasing = true;
            System.out.println("Результат: " + isIncreasing);
        } else {
            System.out.println("Результат: " + isIncreasing);
        }
    }
}
