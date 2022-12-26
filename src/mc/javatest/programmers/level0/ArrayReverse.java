/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : ArrayReverse
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 배열 뒤집기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class ArrayReverse {

    public static void main(String[] args) {
        ArrayReverse arrayReverse = new ArrayReverse();

        int[] num_list = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arrayReverse.solution(num_list)));
    }

    /**
     * 1 ≤ num_list의 길이 ≤ 1,000
     * 0 ≤ num_list의 원소 ≤ 1,000
     */
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for(int i=0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length-(i+1)];
        }

        return answer;
    }

}
