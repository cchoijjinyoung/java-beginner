package mini.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LottoProgram {
    private final Lotto ANSWER;
    private List<Lotto> userLottos;

    public LottoProgram() {
        this.ANSWER = create();
        this.userLottos = new ArrayList<>();
    }

    public void start() {
        System.out.println("[로또 당첨 프로그램]\n");
        System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10):");
    }

    public Lotto create() {
        Lotto lotto = new Lotto();
        List<Integer> numbers = lotto.getNumbers();
        while (numbers.size() < 6) {
            int num = (int) (Math.random() * 45) + 1;
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        Collections.sort(numbers);
        return lotto;
    }

    public void printUserLotto() {
        char symbol = 'A';

        for (Lotto lotto : userLottos) {
            System.out.printf("%c\t", symbol++);
            lotto.print();
            System.out.println();
        }
    }

    public void addUserLotto(Lotto userLotto) {
        userLottos.add(userLotto);
    }

    public void printAnswer() {
        System.out.println("[로또 발표]");
        char symbol = ' ';
        System.out.printf("%c\t", symbol);

        Lotto answer = ANSWER;
        answer.print();
        System.out.println();
    }

    public void printResult() {
        System.out.println("[내 로또 결과]");
        char symbol = 'A';

        for (Lotto lotto : userLottos) {
            System.out.printf("%c\t", symbol++);
            lotto.print();
            result(lotto);
            System.out.println();
        }
    }

    private void result(Lotto lotto) {
        int sameNumber = 0;

        for (int number : lotto.getNumbers()) {
            if (ANSWER.getNumbers().contains(number)) {
                sameNumber++;
            }
        }
        System.out.printf(" => %d개 일치", sameNumber);
    }
}
