package lesson6.task5;

import java.util.Scanner;

public class Major {

    public void getUserInfo() {
        System.out.println("Print your age");

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        System.out.println("This is user's age: " + a);
    }

}
