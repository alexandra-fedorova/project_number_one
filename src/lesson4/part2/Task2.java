package lesson4.part2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        createArray();

    }

    public static void createArray() {

        Scanner s = new Scanner(System.in);
        System.out.print("Array length = ");
        int n = s.nextInt();
        Integer[] numbers = new Integer[n];
        System.out.println("Numers of array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = s.nextInt();
        }
        System.out.println("Result: " + Arrays.toString(numbers));
    }
}
