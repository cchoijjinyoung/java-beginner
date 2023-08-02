package mini;

/**
 * 최진영 (cgy7127)
 * 미니과제2 : 결제 금액 캐시백 게산 프로그램
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
        int cashBack = money / 10;

        if (cashBack >= 300) {
            cashBack = 300;
        } else if (cashBack >= 200) {
            cashBack = 200;
        } else if (cashBack >= 100) {
            cashBack = 100;
        } else {
            cashBack = 0;
        }
        System.out.println("결제 금액은 " + money + "원이고, 캐시백은 " + cashBack + "원 입니다.");
    }

}
