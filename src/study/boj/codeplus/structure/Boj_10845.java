package study.boj.codeplus.structure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10845 {
    static int[] queue;
    static int size;
    public static void main(String[] args) throws IOException {
        queue = new int[10001];
        size = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if ("push".equals(s)) {
                int x = Integer.parseInt(st.nextToken());
                push(x);
            } else if ("pop".equals(s)) {
                sb.append(pop()).append("\n");
            } else if ("size".equals(s)) {
                sb.append(size()).append("\n");
            } else if ("empty".equals(s)) {
                sb.append(empty()).append("\n");
            } else if ("front".equals(s)) {
                sb.append(front()).append("\n");
            } else if ("back".equals(s)) {
                sb.append(back()).append("\n");
            }
        }
        System.out.println(sb.toString());
    }

    public static void push(int num) {
        queue[size] = num;
        size++;
    }

    public static int pop() {
        int result = 0;
        if (size == 0) {
            result = -1;
        } else {
            result = queue[0];
            for (int i = 0; i < size - 1; i++) {
                queue[i] = queue[i + 1];
            }
            queue[size - 1] = 0;
            size--;
        }
        return result;
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        int result = (size == 0) ? 1 : 0;
        return result;
    }

    public static int front() {
        int result = (size != 0) ? queue[0] : -1;
        return result;
    }

    public static int back() {
        int result = (size != 0) ? queue[size - 1] : -1;
        return result;
    }
}
