//package study.prgrmrs;
//
//import java.util.Arrays;
//
//public class Spiral {
//    public static void main(String[] args) {
//        solution(6);
//        solution(3);
//        solution(4);
//        solution(5);
//    }
//
//    public static int[][] solution(int N) {
//        int[][] result = new int[N][N];
//        int num = 1;
//        int x = 0;
//        int y = 0;
//        int repeatedNum = N - 1;
//
//        while (repeatedNum > 0) {
//                for (int i = 0; i < repeatedNum; i++) {
//                    result[x][y] = num++;
//                    y++;
//                }
//                for (int i = 0; i <repeatedNum; i++) {
//                    result[x][y] = num++;
//                    x++;
//                }
//            }
//
//                for (int i = 0; i < repeatedNum; i++) {
//                    result[x][y] = num++;
//                    y--;
//                }
//
//                for (int i = 0; i < repeatedNum; i++) {
//                    result[x][y] = num++;
//                    x--;
//                }
//            repeatedNum = repeatedNum - 2;
//            x++;
//            y++;
//        }
//
//        if (N % 2 == 1) {
//            result[N / 2 -1][N / 2 -1] = N * N;
//        return result;
//    }
//    }
//}
