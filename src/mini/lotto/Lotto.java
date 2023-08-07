package mini.lotto;

import java.util.ArrayList;
import java.util.List;

class Lotto {
    private List<Integer> numbers = new ArrayList<>();

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void print() {
        System.out.printf(
                "%02d,%02d,%02d,%02d,%02d,%02d",
                numbers.get(0),
                numbers.get(1),
                numbers.get(2),
                numbers.get(3),
                numbers.get(4),
                numbers.get(5)
        );
    }
}
