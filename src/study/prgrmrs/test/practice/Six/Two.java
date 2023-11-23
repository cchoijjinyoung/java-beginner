package study.prgrmrs.test.practice.Six;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Two {
    public static void main(String[] args) {
        int answer = 0;
        int[] amount = {7, 10, 4, 5};
        int[] value = {5, 4, 3, 1};
        int[] stomach = {4, 6, 2, 8};
        int totalStomach = Arrays.stream(stomach).sum();

        PriorityQueue<Beef> pq = new PriorityQueue<>(
                (a, b) -> b.value - a.value
        );

        for (int i = 0; i < amount.length; i++) {
            Beef beef = new Beef(amount[i], value[i]);
            pq.add(beef);
        }
        int topBeefPrice = pq.peek().value;
        int topBeefAmount = pq.peek().amount;
        int minStomach = Arrays.stream(stomach).min().getAsInt();


        while (totalStomach > 0 && pq.size() > 0) {
            Beef beef = pq.poll();
            // 고기가 최고급고기면,
            if (beef.value == topBeefPrice) {
                // 인당 먹는 수량 = 최고급고기 수량 / 사람 수
                int per = topBeefAmount / stomach.length;

                // 고기가 사람 수보다 적지 않으면,
                if (per > 0) {
                    // 인당 먹는 수량은 제일 조금 먹는 사람을 기준으로 한다.
                    if (minStomach < per) {
                        per = minStomach;
                    }
                    answer += per * stomach.length * topBeefPrice;

                    for (int i = 0; i < stomach.length; i++) {
                        stomach[i] = stomach[i] - per;
                    }
                    totalStomach -= per * stomach.length;
                }
            } else {
                int price = beef.value;
                int num = beef.amount;
                int curAmount = Math.min(totalStomach, num);
                int curPrice = curAmount * price;
                answer += curPrice;
                totalStomach -= curAmount;
            }
        }
        System.out.println(answer);
    }

    public static class Beef {
        int amount;
        int value;

        public Beef(int amount, int value) {
            this.amount = amount;
            this.value = value;
        }
    }
}
