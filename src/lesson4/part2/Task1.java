package lesson4.part2;

public class Task1 {

    public static void main(String[] args){

        System.out.println(sortedOrNot());

    }

    public static String sortedOrNot() {

        Integer[] numbers = {3, 6, 5, 6, 8};
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


