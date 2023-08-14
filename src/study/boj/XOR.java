package study.boj;

import jdk.nashorn.api.scripting.URLReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class XOR {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        int max = 0;

        for(int i = 0 ; i<n ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            max = Math.max(arr[i], max);
        }
        long ss = 1;
        long answer = 0;
        while(max != 0){
            int count1 = 0;
            for(int i=0; i <arr.length ;i++){
                if(arr[i] == 0)continue;
                if(arr[i]%2 == 1) count1++;
                arr[i] /= 2;
            }
            answer += (((long)count1 * (n - count1)) * (long)ss);
            ss = ss << 1;
            max/=2;
        }

        System.out.print(arr.length==1 ? arr[0] : answer);
    }
}
