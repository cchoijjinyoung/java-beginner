package practice;

public class Practice3 {
    public static String solution(char[] str, char[] from, char[] to) {
        int idx = 0; // 인덱스 변수
        String replaceStr = ""; // 최종 변경될 문자열
        char[] replaceBucket = str.clone();

        do {
            idx = findIndex(replaceBucket, from);

            if (idx != -1) {
                for (int i = 0; i < idx; i++) {
                    replaceStr += replaceBucket[i];
                }
                for (int i = 0; i < to.length; i++) {
                    replaceStr += to[i];
                }
                for (int i = idx + from.length; i < replaceBucket.length; i++) {
                    replaceStr += replaceBucket[i];
                }

                replaceBucket = replaceStr.toCharArray();
                replaceStr = "";
            }

        } while (idx != -1);
        replaceStr = new String(replaceBucket);
        return replaceStr;
    }

    public static int findIndex(char[] str, char[] from) {
        int idx = -1;
        boolean isMatch = false;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == from[0] && str.length - i >= from.length) {
                isMatch = true;
                for (int j = 1; j < from.length; j++) {
                    if (str[i + j] != from[j]) {
                        isMatch = false;
                        break;
                    }
                }
            }
            if (isMatch) {
                idx = i;
                break;
            }
        }
        return idx;
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
