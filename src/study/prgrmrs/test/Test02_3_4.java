package study.prgrmrs.test;

public class Test02_3_4 {

    public static void main(String[] args) {
        int a = 29;
        int b = 15;
        int c = a^b;
        int cnt = 0;
        String s = Integer.toBinaryString(c);
        for (String x : s.split("")) {
            if ("1".equals(x)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
