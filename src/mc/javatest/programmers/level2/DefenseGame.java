/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

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
        // k == enemy.lenght
        if (k == enemy.length) return k;

        int cnt;
        int min = k;
        int max = enemy.length;
        int mid = (min + max) / 2;

        while (true) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            cnt = n;

            for (int i = 0; i < mid; i++) {
                pq.add(enemy[i]);
            }

            while (pq.size() > k) {
                int tmp = pq.poll();
                cnt -= tmp;

                if (cnt <= 0) break;
            }

            if (cnt > 0) {
                min = mid;
                mid = ((min + max) / 2);

                if (min == mid) return min;
            } else if (cnt < 0) {
                max = mid;
                mid = ((min + max) / 2);

                if (max == mid) return --max;
            }
        }

    }

}
