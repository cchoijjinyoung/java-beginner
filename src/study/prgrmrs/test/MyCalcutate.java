package study.prgrmrs.test;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;

public class MyCalcutate {
    public static void main(String[] args) {
        String s = "-3+26-7";
        s += " ";
        boolean isMinus = false;
        List<Character> operator = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        int sum = 0;
        String number = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-' || c == '+' || c == ' ') {
                operator.add(c);
                if (!number.equals("")) {
                    nums.add(Integer.parseInt(number));
                    number = "";
                }
            } else {
                number += c;
            }
        }
        for (char c : operator) {
            System.out.print(c);
        }
        System.out.println();
        for (int num : nums) {
            System.out.print(num);
        }

        for (int i = 0; i < nums.size(); i++) {
            if (operator.get(i) == '-') {
                sum -= nums.get(i);
            } else {
                sum += nums.get(i);
            }
        }
        System.out.println(sum);
    }
}
