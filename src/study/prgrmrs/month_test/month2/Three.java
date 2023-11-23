package study.prgrmrs.month_test.month2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Three {
    public static void main(String[] args) {
        System.out.println(solution(5, 4, new int[]{2, 1, 1, 2, 3}));
    }
    // 가장 전투력이 높은 그룹과 전투력이 낮은 그룹의 전투력 차이의 최솟값
    public static int answer = (int) 1e9;
    // 현재 중복 순열에 포함된 원소의 인덱스(index)
    public static int[] selected = new int[7];

    public static void dfs(int N, int K, int[] arr, int depth) {
        // 모든 중복 순열을 확인하는 부분
        if (depth == N) { // K개의 선택지(그룹)에서 N명이 각자 하나씩 선택한 상황
            // 각 그룹에 속한 학생 목록
            ArrayList<Integer>[] groups = new ArrayList[K];

            for (int i = 0; i < K; i++) {
                groups[i] = new ArrayList<Integer>();
            }
            // 각 학생을 확인하며 각 그룹에 배정
            for (int i = 0; i < N; i++) {
                int index = selected[i];
                groups[index].add(arr[i]);
            }
            // 1명도 배치되지 않은 그룹이 있는 경우 무시
            for (int i = 0; i < K; i++) {
                if (groups[i].size() == 0) return;
            }
            int minScore = (int) 1e9; // 가장 전투력이 낮은 그룹
            int maxScore = (int) -1e9; // 가장 전투력이 높은 그룹
            // 각 그룹을 하나씩 확인하며
            for (int i = 0; i < K; i++) {
                // 해당 그룹의 전투력 계산
                int score = 0;
                for (int j = 0; j < groups[i].size(); j++) {
                    int power = groups[i].get(j);
                    score += groups[i].size() * power;
                }
                minScore = Math.min(minScore, score);
                maxScore = Math.max(maxScore, score);
            }
            // 가장 전투력이 높은 그룹과 전투력이 낮은 그룹의 전투력 차이의 최솟값
            answer = Math.min(answer, Math.abs(minScore - maxScore));
            return;
        }
        // 0번부터 K-1번까지 하나씩 그룹의 인덱스(index)를 확인하며
        for (int i = 0; i < K; i++) {
            selected[depth] = i; // 현재 원소 선택
            dfs(N, K, arr, depth + 1); // 재귀 함수 호출
        }
    }

    // 학생의 수(N), 그룹의 수(K), 협동력 점수 배열(arr)
    public static int solution(int N, int K, int[] arr) {
        dfs(N, K, arr, 0);
        return answer;
    }
}
