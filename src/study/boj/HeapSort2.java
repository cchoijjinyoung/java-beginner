package study.boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Heap {

    public void sort(int[] A) {
        int n = A.length;
        build_min_heap(A, n);
        for (int i = n / 2 - 1; ; i--) {
            int tmp = 0;
            tmp = A[1];
            A[1] = A[i];
            A[i] = tmp;
            heapify(A, 1, i -1);
        }
    }

    private void heapify(int[] A, int k, int n) {
        int left = 2 * k;
        int right = 2 * k + 1;

    }

    private void build_min_heap(int[] A, int n) {
        for (int i = n/2; i >= 1; i--) {

        }
    }
}

public class HeapSort2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken()); // 2, 5, 1, 4, 3
        }
        Heap heap = new Heap();
        heap.sort(arr);



    }
}
