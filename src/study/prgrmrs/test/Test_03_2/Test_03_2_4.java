package study.prgrmrs.test.Test_03_2;

public class Test_03_2_4 {
    public static void main(String[] args) {
        solution(new boolean[][]{{true, true, true, true}, {true, true, false, true}, {true, false, true, true}, {true, true, true, true}}, true);
    }

    public static boolean solution(boolean[][] matrix, boolean b) {
        boolean answer = true;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != b) {
                    answer = false;
                    break;
                }
            }
        }
        return answer;
    }
}


