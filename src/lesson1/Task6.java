package lesson1;

public class Task6 {
    public static void main(String[] args) {

        int x = 13;
        if (x % 2 == 0 && x > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (x % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
