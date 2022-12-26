/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : ArrayMultiplication
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 배열 두 배 만들기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class ArrayMultiplication {

    public static void main(String[] args) {
        ArrayMultiplication arrayMultiplication = new ArrayMultiplication();

        int[] numbers = {1, 2, 100, -99, 1, 2, 3};

        System.out.println(Arrays.toString(arrayMultiplication.solution(numbers)));
    }

    /**
     * -10,000 ≤ numbers의 원소 ≤ 10,000
     * 1 ≤ numbers의 길이 ≤ 1,000
     */
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++){
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }

}
