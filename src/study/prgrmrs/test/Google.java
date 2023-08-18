package study.prgrmrs.test;

public class Google {
    public static void main(String[] args) {
        int[] arr = new int[]{71, 111, 111, 103, 108, 101};
        StringBuilder sb = new StringBuilder();
        String answer = "";

        for (int i : arr) {
            sb.append((char)i);
        }
        answer = sb.toString();
        System.out.println(answer);
    }
}