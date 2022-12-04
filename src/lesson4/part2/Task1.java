package lesson4.part2;

public class Task1 {

    public static void main(String[] args){

        Integer[] numbers = {3, 6, 5, 6, 8};
        System.out.println(sortedOrNot(numbers));

    }

    public static String sortedOrNot(Integer[] numbers) {

        String notSorted = "OK";
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1]) {
                notSorted = "Please try again";
                break;
            }
        }
        return notSorted;
    }

}


