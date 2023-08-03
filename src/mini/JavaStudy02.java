package mini;

/**
 * 최진영 (cgy7127)
 * 미니과제2 : 결제 금액 캐시백 계산 프로그램
 * 작성일 : 2023-08-02
 */

import java.util.Scanner;

public class JavaStudy02 {
    public static void main(String[] args) {
        final int MAX_CASHBACK = 300;
        Scanner scanner = new Scanner(System.in);

        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해주세요.(금액):");

        int money = scanner.nextInt();
        int cashBack = (money / 10 > MAX_CASHBACK) ? MAX_CASHBACK : (money / 10) / 100 * 100;

        System.out.printf("결제 금액은 %d원이고, 캐시백은 %d원 입니다.", money, cashBack);
    }

}
