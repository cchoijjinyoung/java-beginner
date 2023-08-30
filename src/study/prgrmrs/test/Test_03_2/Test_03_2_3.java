package study.prgrmrs.test.Test_03_2;

public class Test_03_2_3 {
    public static void main(String[] args) {
        solution(new int[]{1, 3, 5, 7, 9}, "<", ", ", ">");
    }

    public static String solution(int[] arr, String prefix, String separator, String postfix) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        for (int i = 0; i < arr.length - 1; i++) {
            sb.append(String.valueOf(arr[i]));
            sb.append(separator);
        }
        sb.append(String.valueOf(arr[arr.length - 1]));
        sb.append(postfix);
        System.out.println(sb.toString());
        return answer;
    }
}


