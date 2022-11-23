package lesson1;

public class Task6 {
    public static void main(String[] args) {

        int a = 13;
        if (a % 2 == 0 && a > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (a % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}
