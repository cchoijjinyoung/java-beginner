package study.boj.exam;

import java.util.Scanner;

public class Boj_1254 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int answer = A.length();
        int find = A.length() - 1; // 마지막 문자
        int target = A.indexOf(A.charAt(find)); // 마지막 문자와 같고, 가장 앞에 오는 문자
        boolean isPalindrome = false;
        while (!isPalindrome) { // 타겟부터 펠린드롬인지 검사
            int lt = target;
            int rt = find;

            while (lt <= rt) {
                if (A.charAt(lt) != A.charAt(rt)) {
                    isPalindrome = false;
                    target = A.indexOf(A.charAt(find), target + 1);
                    break;
                } else {
                    isPalindrome = true;
                    lt++;
                    rt--;
                }
            }
        }
        answer += target;
        System.out.println(answer);
    }
}
