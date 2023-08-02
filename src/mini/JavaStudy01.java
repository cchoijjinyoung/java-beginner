package mini;

/**
 * 최진영 (cgy7127)
 * 미니과제1 : 콘솔 화면에 구구단 출력하기
 * 작성일 : 2023-08-02
 */

public class JavaStudy01 {
    public static void display() {
        System.out.println("[구구단 출력]");
    }

    public static void timesTablePrint() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=9; j++) {
                System.out.print(String.format("%02d x %02d = %02d\t", j, i, i * j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        display();

        timesTablePrint();
    }
}
