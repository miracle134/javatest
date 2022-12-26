/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

import mc.javatest.programmers.level0.NextNumber;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : HallOfFame
 * author         : MiracleCat
 * date           : 2022-12-17(017)
 * description    : 명예의 전당(1)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-17(017)        MiracleCat       최초 생성
 */
public class HallOfFame {

    public static void main(String[] args) {
        HallOfFame hallOfFame = new HallOfFame();

        int k = 3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};

        System.out.println(Arrays.toString(hallOfFame.solution(k, score)));
    }

    /**
     * 3 ≤ k ≤ 100
     * 7 ≤ score의 길이 ≤ 1,000
     * 0 ≤ score[i] ≤ 2,000
     *
     * @param k
     * @param score
     * @return
     */
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < score.length; i++) {
            pq.add(score[i]);

            if(pq.size() > k) pq.poll();

            answer[i] = pq.peek();
        }

        return answer;
    }

}
