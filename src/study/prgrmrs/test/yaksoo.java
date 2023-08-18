package study.prgrmrs.test;

import java.util.HashMap;
import java.util.HashSet;

public class yaksoo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "";
        long sum = 0;
        for (char c : s.toCharArray()) {
            if (c >= 'a'){
                c -= 'a';
                c += 10;
                sb.append(Integer.toBinaryString(c));
            } else if (c > '0') {
                if (c <= '7') {
                    sb.append("0");
                }
                c -= '0';
                sb.append(Integer.toBinaryString(c));
            } else if (c == '0') {
                sb.append("0000");
            }
        }
        int a = 3;
        String answer = sb.toString();
        System.out.println(answer);
    }
}