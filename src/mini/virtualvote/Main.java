package mini.virtualvote;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int voteCnt = 0;
        Map<Integer, Player> players = new HashMap<>();
        Map<Integer, Integer> voteCntOfPlayers = new HashMap<>();

        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int totalVoteCnt = scanner.nextInt();

        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int numOfPlayer = scanner.nextInt();


        for (int i = 1; i <= numOfPlayer; i++) {
            System.out.print(i + "번째 후보자이름을 입력해 주세요.");
            Player player = new Player();
            String name = scanner.next();
            player.setName(name);
            players.put(i, player);
        }

        Random random = new Random();
        while (voteCnt < totalVoteCnt) {
            int symbolNumber = random.nextInt(players.size()) + 1;
            voteCnt++;
            players.get(symbolNumber).vote();


        }
    }
}
