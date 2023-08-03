package practice;

import java.io.*;

/**
 * Java_13_2 파일 입출력 연습
 */

public class Practice_IO {
    public static void main(String[] args) throws IOException {
        // 텍스트 파일을 읽어서 '자바' -> 'JAVA' 로 변경하기.
        String inputFile = "./JamesArthurGosling.txt";
        String outputFile = "./JamesArthurGosling_edit.txt";

        FileWriter fw = new FileWriter(outputFile);
        PrintWriter pw = new PrintWriter(fw);

        BufferedReader br = new BufferedReader(new FileReader(inputFile));

        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            String newLine = line.replace("자바", "JAVA");

            pw.println(newLine);
        }
        pw.close();
        br.close();
    }
}
