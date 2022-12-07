package lesson5;

public class Task3 {

    public static void main(String[] args) {

        String censoringText = new String("В этом тексте дважды повторяется слово бяка, чтобы проверить вырезаемость слова бяка");
        censorship(censoringText);

    }

    public static void censorship(String censoringText) {

        System.out.println(censoringText.replace("бяка", "[вырезано цензурой]"));

    }
}
