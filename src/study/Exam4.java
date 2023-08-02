package study;

public class Exam4 {
    public static void main(String[] args) {
        String my_string = "        i   love you";
        String[] answer = {};
        String[] tmp = my_string.split(" ");
        for (int i = 0; i < tmp.length; i++) {
            System.out.println("tmp[" + i + "] = " + tmp[i]);
        }
        for (String x : tmp) {
            if (x.equals("")) {
                System.out.println(x);
            }
            System.out.println("x = " + x);
        }
    }
}
