package lesson5;

public class Task2 {
    public static void main(String[] args) {

        String testWord = new String("шалаш");
        palindromeOrNot(testWord);

    }

    public static void palindromeOrNot(String testWord) {

        StringBuffer notReversed = new StringBuffer(testWord);
        String reversed = new StringBuffer(testWord).reverse().toString();
        System.out.println(reversed.equals(notReversed.toString()));
    }
}
