/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : MakeMaxValue
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 최댓값 만들기(1)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class MakeMaxValue {

    public static void main(String[] args) {
        MakeMaxValue makeMaxValue = new MakeMaxValue();

        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(makeMaxValue.solution(numbers));
    }

    /**
     * 0 ≤ numbers 의 원소 ≤ 10,000
     * 2 ≤ numbers 의 길이 ≤ 100
     */
    public int solution(int[] numbers) {
        int answer = 0;

        Arrays.sort(numbers);

        answer = numbers[numbers.length-1] * numbers[numbers.length-2];

        return answer;
    }

}
