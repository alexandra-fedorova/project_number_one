package lesson5;

public class Task4 {
    public static void main(String[] args) {

        String string = "Some text that contains the letter A, letter B, letter C and another letter";
        String subString = "letter";
        lookingForMatches(string, subString);
    }

    public static void lookingForMatches(String string, String subString) {
        int x = subString.length();
        int counter = 0;
        for (int i = 0; i < string.length() - x + 1; i++) {
            int y = i + x;
            String newString = string.substring(i, y);
            if (newString.equalsIgnoreCase(subString)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
