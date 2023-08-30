package study.prgrmrs.test.Test_03_1;

public class Test_03_1_5 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 11;
        int price = 10;
        int cnt = 0;
        if (n == 100) {
            cnt = 91;
        } else if (n < 10) {
            cnt = n;
        } else if (n >= 10 && n <= 99) {
            int ten = n / 10;
            int one = n % 10;
            if (ten == one) {
                cnt = ten * 10;
            } else if (ten > one) {
                cnt = n - (ten - 1);
            } else if (ten < one) {
                cnt = n - (ten - 1) - 1;
            }
        }
        answer = cnt * price;
        System.out.println(answer);
    }
}

