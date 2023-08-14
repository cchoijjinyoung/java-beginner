package study.boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CountingNum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int i = 0;
        String[] arr = new String[st.countTokens()];
        while (st.hasMoreTokens()) {
            arr[i] = st.nextToken();
            i++;
        }

        HashMap<String, Integer> hm = new HashMap<>();
        for (String x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        Integer answer = hm.get(br.readLine());
        if (answer == null) answer = 0;
        System.out.println(answer);
    }
}
