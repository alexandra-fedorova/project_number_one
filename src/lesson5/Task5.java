package lesson5;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {

        String text = "This is a test string";
        System.out.println("The given string is: " + text);
        reversedText(text);
    }

    public static void reversedText(String text) {
        String[] words = text.split(" ");
        StringBuilder reversedText = new StringBuilder();

        for (String s : words) {
            StringBuilder reversedWord = new StringBuilder();
            reversedText.append(reversedWord.append(s).reverse()).append(" ");
        }
        System.out.println("The string reversed word by word is:");
        System.out.println(reversedText);
    }
}
