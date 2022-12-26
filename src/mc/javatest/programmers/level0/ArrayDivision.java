/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : ArrayDivision
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 배열 자르기
 * 도움말
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class ArrayDivision {

    public static void main(String[] args) {
        ArrayDivision arrayDivision = new ArrayDivision();

        int[] numbers = {1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        System.out.println(Arrays.toString(arrayDivision.solution(numbers, num1, num2)));
    }

    /**
     * 2 ≤ numbers 의 길이 ≤ 30
     * 0 ≤ numbers 의 원소 ≤ 1,000
     * 0 ≤num1 < num2 < numbers 의 길이
     */
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2-(num1-1)];

        for(int i = 0; i < answer.length; i++){
            answer[i] = numbers[num1+i];
        }

        return answer;
    }

}
