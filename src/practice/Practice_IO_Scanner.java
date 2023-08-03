package practice;

import java.io.*;
import java.util.Scanner;

/**
 * Java_13_2 파일 입출력 연습
 */

public class Practice_IO_Scanner {
    public static void main(String[] args) throws IOException {
        // 텍스트 파일의 단어를 사용자가 원하는 단어로 변경하기.
        String inputFile = "./JamesArthurGosling.txt";
        String outputFile = "./JamesArthurGosling_edit.txt";

        Scanner sc = new Scanner(System.in);
        System.out.print("찾을 단어 : ");
        String find = sc.nextLine();
        System.out.print("변경 단어 : ");
        String to = sc.nextLine();

        FileWriter fw = new FileWriter(outputFile);
        PrintWriter pw = new PrintWriter(fw);

        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            String newLine = line.replace(find, to);

            pw.println(newLine);
        }
        pw.close();
        br.close();
    }
}
