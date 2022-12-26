/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : DefenseGame
 * author         : MiracleCat
 * date           : 2022-12-16
 * description    : 디펜스 게임
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-16        MiracleCat       최초 생성
 */
public class DefenseGame {

    public static void main(String[] args) {
        DefenseGame defenseGame = new DefenseGame();

        int n = 7;
        int k = 3;
        int[] enemy = {4, 2, 4, 5, 3, 3, 1};

        System.out.println(defenseGame.solution(n, k, enemy));
    }

    /**
     * 1 ≤ n ≤ 1,000,000,000
     * 1 ≤ k ≤ 500,000
     * 1 ≤ enemy의 길이 ≤ 1,000,000
     * 1 ≤ enemy[i] ≤ 1,000,000
     * enemy[i]에는 i + 1 라운드에서 공격해오는 적의 수가 담겨있습니다.
     * 모든 라운드를 막을 수 있는 경우에는 enemy[i]의 길이를 return 해주세요.
     *
     * @param n
     * @param k
     * @param enemy
     * @return
     */
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;

        // k == enemy.lenght
        if (k == enemy.length) return k;

        int army = n;
        int shield = k;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i = 0; i < enemy.length; i++) {
            army -= enemy[i];
            pq.add(enemy[i]);

            if (army < 0) {
                if (shield > 0 && !pq.isEmpty()) {
                    int t = pq.poll();
                    army += t;
                    shield--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }

}
