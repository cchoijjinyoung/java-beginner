package mini;

import java.util.Scanner;

/**
 * 최진영 (cgy7127)
 * 미니과제3 : 놀이동산 입장권 계산 프로그램
 * 작성일 : 2023-08-02
 */

public class JavaStudy03 {
    public static void main(String[] args) {
        int price = 10000;
        Scanner sc = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자):");
        int age = sc.nextInt();

        System.out.print("입장시간을 입력해 주세요.(숫자입력):");
        int enterTime = sc.nextInt();

        System.out.print("국가유공자 여부를 입력해 주세요.(y/n):");
        String merit = sc.next();

        System.out.print("복지카드 여부를 입력해 주세요.(y/n):");
        String card = sc.next();

        if (age < 3) {
            price = 0;
        } else if (age < 13 || enterTime > 17) {
            price = 4000;
        } else if (merit.equals("y") || card.equals("y")) {
            price = 8000;
        }
        System.out.println("입장료: " + price);
    }
}