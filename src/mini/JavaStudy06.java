package mini;

import java.util.*;

/**
 * 최진영(cgy7127)
 * 미니과제6 : 가상 선거 및 당선 시뮬레이션 프로그램
 * 작성일 : 2023-08-05
 */

class Player {
    int cnt = 0;
    String name;

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class JavaStudy06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0; // 후보자 득표 수
        int max = 0; // 가장 많이 받은 후보자 득표 수
        String answer = ""; // 투표결과
        System.out.print("총 진행할 투표수를 입력해 주세요.");
        int totalCnt = sc.nextInt();

        List<Player> playerList = new ArrayList<>();
        System.out.print("가상 선거를 진행할 후보자 인원을 입력해 주세요.");
        int personnel = sc.nextInt();
        for (int i = 1; i <= personnel; i++) {

            Player player = new Player();
            System.out.printf("%d번째 후보자이름을 입력해주세요.", i);
            String name = sc.next();
            player.setName(name);
            playerList.add(player);
        } // playerList = {player1, player2, ....}

        Random random = new Random();
        while (cnt < totalCnt) {
            int selectNum = random.nextInt(playerList.size());
            cnt++;
            playerList.get(selectNum).cnt++;

            System.out.printf("[투표진행률]: %.2f%%, %d명 투표 => %s\n"
                    , (float) cnt/totalCnt * 100, cnt, playerList.get(selectNum).getName());

            for (int i = 0; i < playerList.size(); i++) {
                System.out.printf("[기호:%d] %s:\t%.2f%%\t(투표수: %d)\n"
                        , i + 1, playerList.get(i).getName()
                        , (float) playerList.get(i).getCnt()/totalCnt * 100
                        , playerList.get(i).getCnt());
                if (playerList.get(i).getCnt() > max) {
                    max = playerList.get(i).getCnt();
                    answer = playerList.get(i).getName();
                }
            }
            System.out.println();
        }
        System.out.println("[투표결과] 당선인 : " + answer);
    }
}
