package study;

import java.util.ArrayList;

public class Exam2 {
    public static void main(String[] args) {
        int balls = 5;
        int share = 3;
        int result = 1;
        for (int i = 0; i < balls - share; i++) {
            result *= balls - i;
        }
        for (int i = 0; i < balls - share; i++) {

        }
    }

    public int factorial(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
