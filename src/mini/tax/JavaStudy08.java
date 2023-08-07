package mini.tax;

/**
 * 최진영 (cgy7127)
 * 미니과제8 : 연소득 과세금액 계산 프로그램
 * 작성일 : 2023-08-07
 */

import java.util.Scanner;

public class JavaStudy08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaxCalculateProgram taxCalculateProgram = new TaxCalculateProgram();

        System.out.print("연소득을 입력해 주세요.:");
        long mySalary = scanner.nextLong();

        // 세금 구간 출력 및 계산
        taxCalculateProgram.calculate(mySalary);
        System.out.println();

        // 세율에 의한 세금
        taxCalculateProgram.printByTariff();
        System.out.println();

        // 누진공제 계산에 의한 세금
        taxCalculateProgram.printByProgressiveDeduction();
        System.out.println();
    }
}
