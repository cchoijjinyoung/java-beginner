package mini.lotto;

import java.util.*;

/**
 * 최진영 (cgy7127)
 * 미니과제7 : 로또 당첨 프로그램
 * 작성일 : 2023-08-06
 */

public class JavaStudy07 {
    public static void main(String[] args) {
        LottoProgram lottoProgram = new LottoProgram();
        Scanner scanner = new Scanner(System.in);

        lottoProgram.start();

        int cnt = scanner.nextInt();

        for (int i = 0; i < cnt; i++) {
            Lotto userLotto = lottoProgram.create();

            lottoProgram.addUserLotto(userLotto);
        }

        lottoProgram.printUserLotto();
        System.out.println();

        lottoProgram.printAnswer();
        System.out.println();

        lottoProgram.printResult();
    }
}
