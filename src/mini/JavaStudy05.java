package mini;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalField;
import java.util.Scanner;

/**
 * 최진영 (cgy7127)
 * 미니과제5 : 달력 출력 프로그램
 * 작성일 : 2023-08-04
 */

public class JavaStudy05 {

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

        LocalDate date = LocalDate.of(year, month, 1);
        int yoilOfFirstDay = date.getDayOfWeek().getValue();
        if (yoilOfFirstDay != 7) {
            for (int i = 0; i < yoilOfFirstDay; i++) {
                System.out.print("\t");
            }
        }
        for (int i = 1; i <= date.lengthOfMonth(); i++) {
            System.out.printf("%02d\t", i);
            if ((i + yoilOfFirstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }
}
