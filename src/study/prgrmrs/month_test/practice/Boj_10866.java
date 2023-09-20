package study.prgrmrs.month_test.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Boj_10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        MyDeque deque = new MyDeque(N);

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if ("push_front".equals(command)) {
                int X = Integer.parseInt(st.nextToken());
                deque.push_front(X);
            } else if ("push_back".equals(command)) {
                int X = Integer.parseInt(st.nextToken());
                deque.push_back(X);
            } else if ("pop_front".equals(command)) {
                System.out.println(deque.pop_front());
            } else if ("pop_back".equals(command)) {
                System.out.println(deque.pop_back());
            } else if ("size".equals(command)) {
                System.out.println(deque.size());
            } else if ("empty".equals(command)) {
                System.out.println(deque.empty());
            } else if ("front".equals(command)) {
                System.out.println(deque.front());
            } else if ("back".equals(command)) {
                System.out.println(deque.back());
            }
        }
    }

    public static class MyDeque {
        int[] list;
        int size;

        public MyDeque(int N) {
            this.list = new int[N];
            this.size = 0;
        }

        public void push_front(int X) {
            for (int i = size; i > 0; i--) {
                list[i] = list[i - 1];
            }
            list[0] = X;
            size++;
        }

        public void push_back(int X) {
            list[size] = X;
            size++;
        }

        public int pop_front() {
            if (size == 0) {
                return -1;
            }
            int result = list[0];
            for (int i = 0; i < this.size - 1; i++) {
                list[i] = list[i + 1];
            }
            list[size - 1] = 0;
            size--;
            return result;
        }

        public int pop_back() {
            if (size == 0) {
                return -1;
            }
            int result = list[size - 1];
            list[size - 1] = 0;
            size--;
            return result;
        }

        public int size() {
            return this.size;
        }

        public int empty() {
            return size == 0 ? 1 : 0;
        }

        public int front() {
            if (size == 0) {
                return -1;
            }
            return list[0];
        }

        public int back() {
            if (size == 0) {
                return -1;
            }
            return list[size - 1];
        }
    }
}
