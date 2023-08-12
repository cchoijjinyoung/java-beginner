package study;

import java.util.Scanner;

public class nakseojang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("age = " + age);

        String name = sc.next();
        sc.nextLine();
        System.out.println("name = " + name);

        String birthDay = sc.nextLine();
        System.out.println("birthDay = " + birthDay);
    }
}
