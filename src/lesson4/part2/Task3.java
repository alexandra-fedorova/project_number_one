package lesson4.part2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4};
        change(numbers);
    }

    public static void change(Integer[] numbers) {

        System.out.println("Array 1: " + Arrays.toString(numbers));

        int a;
        a = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = a;

        System.out.println("Array 2: " + Arrays.toString(numbers));

    }
}


