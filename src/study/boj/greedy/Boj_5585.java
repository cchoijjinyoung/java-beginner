package study.boj.greedy;

import java.util.Scanner;

public class Boj_5585 {
    public static void main(String[] args) {
        int PAYMENT = 1000;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int returnMoney = PAYMENT - N;
        int[] coins = {500, 100, 50, 10, 5, 1};
        int answer = 0;

        for (int coin : coins) {
            answer += returnMoney / coin;
            returnMoney %= coin;
        }
        System.out.println(answer);
    }
}
