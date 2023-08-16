package study.prgrmrs.lv1;

import mini.virtualvote.Player;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class RunningCompetition {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        HashMap<String, Integer> mappedByPlayer = new HashMap<>();
        HashMap<Integer, String> mappedByRank = new HashMap<>();

        for (int rank = 0; rank < players.length; rank++) {
            mappedByPlayer.put(players[rank], rank + 1);
            mappedByRank.put(rank + 1, players[rank]);
        }

        for (String calling : callings) {
            int curRank = mappedByPlayer.get(calling);
            String cur = mappedByRank.get(curRank);

            int preRank = curRank - 1;
            String pre = mappedByRank.get(preRank);

            mappedByPlayer.put(cur, curRank - 1);
            mappedByPlayer.put(pre, preRank + 1);

            mappedByRank.put(curRank, pre);
            mappedByRank.put(preRank, cur);
        }

        String[] answer = new String[mappedByRank.size()];
        for (int i = 0; i < mappedByRank.size(); i++) {
            System.out.println(mappedByRank.get(i + 1));
            answer[i] = mappedByRank.get(i + 1);
        }
    }
}
