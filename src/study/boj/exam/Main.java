package study.boj.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] coins = new int[N];
        for (int i = coins.length - 1; i >= 0; i--) {
            coins[i] = sc.nextInt();
        }

        for (int coin : coins) {
            if (target < coin) {
                continue;
            } else {
                cnt += target / coin;
                target = target % coin;
            }
        }
        System.out.println(cnt);
    }
}
