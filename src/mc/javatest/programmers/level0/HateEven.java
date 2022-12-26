/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : HateEven
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 짝수는 싫어요
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class HateEven {

    public static void main(String[] args) {
        HateEven hateEven = new HateEven();

        int n = 15;

        System.out.println(Arrays.toString(hateEven.solution(n)));
    }

    /**
     * 1 ≤ n ≤ 100
     */
    public int[] solution(int n) {
        int len = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[len];

        for(int i = 0; i < len; i++){
            answer[i] = i * 2 + 1;
        }

        return answer;
    }

}
