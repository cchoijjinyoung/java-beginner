package study.boj.codeplus.math_basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Exam04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int length = x > y ? y : x;

        int minVal = 0;
        int maxVal = 0;

        for (int i = 1; i <= length; i++) {
            if (x % i == 0 && y % i == 0) {
                minVal = i;
            }
        }

        maxVal = x * y / minVal;

        sb.append(minVal + "\n").append(maxVal);
        System.out.println(sb);
    }
}
