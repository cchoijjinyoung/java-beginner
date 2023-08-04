package mini;

import java.util.Random;
import java.util.Scanner;

/**
 * 최진영 (cgy7127)
 * 미니과제4 : 주민등록번호 생성 프로그램
 * 입력값은 2020년도 이후로 입력한다는 전제.
 * 작성일 : 2023-08-04
 */

public class JavaStudy04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("[주민등록번호 계산]");

        // 앞자리
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        String yyyy = String.format("%d", year % 100);

        System.out.print("출생월을 입력해 주세요.(mm)");
        int month = sc.nextInt();
        String mm = String.format("%02d", month);

        System.out.print("출생일을 입력해 주세요.(dd)");
        int day = sc.nextInt();
        String dd = String.format("%02d", day);

        String frontNum = yyyy + mm + dd;

        // 뒷자리
        System.out.print("성별을 입력해 주세요.(m/f)");
        String sex = sc.next();
        if (sex.equals("m")) {
            sex = "3";
        } else if (sex.equals("f")) {
            sex = "4";
        }

        int num = random.nextInt(999999) + 1;
        String randomNum = String.format("%06d", num);

        String backNum = sex + randomNum;

        String answer = frontNum + "-" + backNum;
        System.out.println(answer);
    }
}
