package practice;

public class Practice5 {
    public static int solution(int[] height) {
        int answer = 0;
        int lt = height[0];
        int rt = height[height.length - 1];

//        while ()
        return answer;
    }

    public static void main(String[] args) {
        // Test code
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(solution(height));

        height = new int[]{5, 3, 9, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2};
        System.out.println(solution(height));

    }
}
