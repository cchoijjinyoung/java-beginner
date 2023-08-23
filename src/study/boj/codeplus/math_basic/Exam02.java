//package study.boj.codeplus;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.math.BigInteger;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Exam02 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = "";
//        while ((s = br.readLine()) != null) {
//            int x = Integer.parseInt(s);
//            BigInteger num = BigInteger.valueOf(1);
//            int cnt = 1;
//            while (true) {
//                if (num % x == 0) {
//                    System.out.println(cnt);
//                    break;
//                } else {
//                    num = num * 10 + 1;
//                    cnt++;
//                }
//            }
//        }
//    }
//}
