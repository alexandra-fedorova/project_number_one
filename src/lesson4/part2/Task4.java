package lesson4.part2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        unique();
    }

    public static void unique() {
        Integer[] numbers = {2, 2, 3, 3, 2, 1};


        for (int i = 0; i < numbers.length; i++) {
            int a = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    a++;
                }
            }
            if (a == 1) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }
}