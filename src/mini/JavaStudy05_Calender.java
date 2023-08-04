package mini;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 최진영 (cgy7127)
 * 미니과제5 : 달력 출력 프로그램
 * 작성일 : 2023-08-04
 */

public class JavaStudy05_Calender {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy):");
        int year = sc.nextInt();
        String yyyy = String.format("%d", year);

        System.out.print("달력의 월을 입력해 주세요.(mm):");
        int month = sc.nextInt();
        String mm = String.format("%02d", month);

        System.out.printf("\n\n[%s년 %s월]\n", yyyy, mm);
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1); // 1월이 0, 2월이 1.....12월이 11 로 설정되어있다.
        cal.set(Calendar.DAY_OF_MONTH, 1);

        // yyyy-mm-01일의 요일
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);

        // mm의 마지막 날짜
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (dayOfWeek != 7) {
            for (int i = 1; i < dayOfWeek; i++) {
                System.out.print("\t");
            }
        }
        for (int i = 1; i <= lastDayOfMonth; i++) {
            System.out.printf("%02d\t", i);

            if ((i + dayOfWeek - 1) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
