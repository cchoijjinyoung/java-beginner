package study.prgrmrs.test.Test_03_5;

import java.util.ArrayList;
import java.util.List;

public class Test_03_5_2 {
    public static void main(String[] args) {
        solution(278, 3);
    }

    public static int solution(int n, int k) {
        int answer = 0;
        int idx = 0;
        boolean isMinus = false;
        StringBuilder sb = new StringBuilder();

        if (n < 0) {
            isMinus = true;
        }

        if (n == 0) {
            return k * 10;
        }

        if (isMinus) {
            sb.append("-");
            String s = String.valueOf(n).substring(1);
            char[] cArr = s.toCharArray();
            for (int i = 0; i < cArr.length; i++) {
                if (cArr[i] - '0' > k) {
                    sb.append(k);
                    sb.append(s.substring(i));
                    break;
                } else {
                    sb.append(cArr[i]);
                }
            }
        } else {
            String s = String.valueOf(n);
            char[] cArr = s.toCharArray();
            for (int i = 0; i < cArr.length; i++) {
                if (cArr[i] - '0' > k) {
                    sb.append(cArr[i]);
                } else {
                    sb.append(k);
                    sb.append(s.substring(i));
                    break;
                }
            }
        }
        answer = Integer.parseInt(sb.toString());
        System.out.println(answer);
        return answer;
    }
}
