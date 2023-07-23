package practice;

public class Practice3 {
    public static String solution(char[] str, char[] from, char[] to) {
        int idx = 0;
        String replaceStr = "";
        char[] replaceBucket = str.clone();
        
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String from = "Java";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(from, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] fromArr = from.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, fromArr, toArr));

        strExArr = "POP".toCharArray(); fromArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, fromArr, toArr));
    }
}
