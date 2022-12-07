package lesson5;

public class Task1 {
    public static void main(String[] args) {

        String testString = new String("В этом тексте определяется самое длинное слово");
        longest(testString);
    }

    public static void longest(String testString) {
        int maximum = 0;
        String longestWord = "";
        for (String s : testString.split(" ")) {
            if (maximum < s.length()) {
                maximum = s.length();
                longestWord = s;
            }
        }
        System.out.println(longestWord);
    }

}

