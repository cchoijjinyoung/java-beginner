package study.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BO_ArrayExam1 {
    public static void main(String[] args) throws Exception {
        // 5
        // 20 10 35 30 7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;



        for (String item : arr) {
            int number = Integer.parseInt(item);
            if (number >= max) {
                max = number;
            }
            if (number <= min) {
                min = number;
            }
        }
        System.out.println(min + " " + max);
    }
}
