/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : FruitSeller
 * author         : MiracleCat
 * date           : 2022-12-17(017)
 * description    : 과일 장수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-17(017)        MiracleCat       최초 생성
 */
public class FruitSeller {

    public static void main(String[] args) {
        FruitSeller fruitSeller = new FruitSeller();

        int k = 3;
        int m = 4;
        int[] score = {1, 2, 3, 1, 2, 3, 1};

        System.out.println(fruitSeller.solution(k, m, score));
    }

    /**
     * 3 ≤ k ≤ 9
     * 3 ≤ m ≤ 10
     * 7 ≤ score의 길이 ≤ 1,000,000
     * 1 ≤ score[i] ≤ k
     * 이익이 발생하지 않는 경우에는 0을 return 해주세요.
     *
     * @param k
     * @param m
     * @param score
     * @return
     */
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        // 포장 불가
        if (score.length < m) return 0;

        // 정렬
        Arrays.sort(score);

        for (int i = score.length-m; i >= 0 ; i-=m) {
            answer += score[i] * m;
        }

        return answer;
    }

}
