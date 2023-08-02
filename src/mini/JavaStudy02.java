package mini;

import java.util.Scanner;

public class JavaStudy02 {
    public static void main(String[] args) {
        display();

        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
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

    private static void display() {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해주세요.(금액):");
    }
}
