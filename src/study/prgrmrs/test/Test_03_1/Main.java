package study.prgrmrs.test.Test_03_1;

import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int answer = 0;
        int n = 0;
        while (n < 10000) {
            BigInteger divide = new BigInteger("1000000007");
            BigInteger sum = new BigInteger("9");
            BigInteger pow = new BigInteger("1");
            BigInteger ten = new BigInteger("10");
            int cnt = 0;
            if (n % 2 == 0) {
                cnt = n / 2 - 1;
            } else if (n % 2 == 1) {
                cnt = n / 2;
            }

            for (int i = 0; i < cnt; i++) {
                pow = pow.multiply(ten);
            }
            sum = sum.multiply(pow);
            sum = sum.remainder(divide);
            answer = sum.intValue();
            System.out.println(answer);
            n++;
        }
    }
}

