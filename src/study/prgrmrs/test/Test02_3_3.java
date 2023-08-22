package study.prgrmrs.test;

import com.sun.javafx.css.CalculatedValue;
import sun.awt.image.ImageWatched;

import java.util.*;

public class Test02_3_3 {

    public static void main(String[] args) {
        double answer = 0;
        String s = "2*3+5/6*3+15";
        LinkedList<Character> ops = new LinkedList<>();
        LinkedList<Double> nums = new LinkedList<>();
        char[] arr = s.toCharArray();
        int xCnt = 0;
        int dCnt = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i])) { // 숫자냐
                int left = i;
                int right = i + 1;
                int cnt = 0;
                while (right < arr.length) {
                    if (Character.isDigit(arr[right])) {
                        cnt++;
                        right++;
                    } else {
                        break;
                    }
                }
                nums.add(Double.parseDouble(s.substring(left, right)));
                i += cnt;
            } else if (!Character.isDigit(arr[i])) { // 문자냐
                if (arr[i] == '*') xCnt++;
                else if (arr[i] == '/') dCnt++;
                ops.add(arr[i]);
            }
        }
        while (xCnt > 0 || dCnt > 0) {
            int x = ops.indexOf('*');
            int y = ops.indexOf('/');

            int idx = x > y ? y : x;

            if (x == -1) {
                idx = y;
            } else if (y == -1) {
                idx = x;
            }
            double d = 0;
            switch (ops.get(idx)) {
                case '*':
                    d = nums.get(idx) * nums.get(idx + 1);
                    nums.remove(idx);
                    nums.remove(idx);
                    nums.add(idx, d);
                    ops.remove(idx);
                    xCnt--;
                    break;
                case '/':
                    d = nums.get(idx) / nums.get(idx + 1);
                    nums.remove(idx);
                    nums.remove(idx);
                    nums.add(idx, d);
                    ops.remove(idx);
                    dCnt--;
            }
        }

        while (!ops.isEmpty()) {
            double d = 0;
            int idx = 0;
            switch (ops.get(idx)) {
                case '+':
                    d = nums.get(idx) + nums.get(idx + 1);
                    nums.remove(idx);
                    nums.remove(idx);
                    nums.add(idx, d);
                    ops.remove(idx);
                    xCnt--;
                    break;
                case '-':
                    d = nums.get(idx) - nums.get(idx + 1);
                    nums.remove(idx);
                    nums.remove(idx);
                    nums.add(idx, d);
                    ops.remove(idx);
                    dCnt--;
            }
        }
        answer = nums.get(0);
        int a = (int)(answer * 100);
        double b = (double)a / 100;
        System.out.println(b);
        System.out.println(a);
        System.out.println(answer);
    }
}
