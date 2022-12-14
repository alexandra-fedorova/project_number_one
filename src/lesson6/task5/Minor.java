package lesson6.task5;

import java.util.Scanner;

public class Minor extends Major {

    @Override
    public void getUserInfo() {
        System.out.println("What's your name?");

        Scanner s = new Scanner(System.in);
        String a = s.nextLine();

        System.out.println("This is user's name: " + a);
    }
}
