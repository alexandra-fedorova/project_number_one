package lesson4.part1;

public class Task6 {

    public static void main(String[] args) {

        Integer[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        oneOrThree(numbers);

    }
     public static void oneOrThree(Integer[] numbers) {

        boolean isThereOneOrThree = false;

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 1 || numbers[i] == 3) {
                isThereOneOrThree = true;
                System.out.println(isThereOneOrThree);
                break;
            }
        }
     }
}
