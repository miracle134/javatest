/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : OddEvenCount
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 짝수 홀수 개수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class OddEvenCount {

    public static void main(String[] args) {
        OddEvenCount oddEvenCount = new OddEvenCount();

        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(oddEvenCount.solution(num_list)));
    }

    /**
     * 1 ≤ num_list의 길이 ≤ 100
     * 0 ≤ num_list의 원소 ≤ 1,000
     */
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i : num_list){
            if(i % 2 == 0) answer[0]++;
            else answer[1]++;
        }

        return answer;
    }

}
