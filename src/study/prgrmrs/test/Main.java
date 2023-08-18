package study.prgrmrs.test;

public class Main {
    public static void main(String[] args) {
        char c = ' ';
        int n = 10000000;
        double answer = Math.sqrt(n);
        try {
            answer %= 0;
        } catch (Exception e) {
        } finally {
            System.out.println("Answer = 0");
            return;
        }
    }
}