package lesson5;

public class Task3 {

    public static void main(String[] args) {

        String censoringText = new String("В этом тексте дважды повторяется слово бяка, чтобы проверить вырезаемость слова бяка");
        String censoredWord = new String("бяка");
        censorship(censoringText, censoredWord);

    }

    public static void censorship(String censoringText, String censoredWord) {

        System.out.println(censoringText.replace(censoredWord, "[вырезано цензурой]"));

    }
}
