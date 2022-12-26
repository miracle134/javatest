/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : ArrayAverage
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 배열의 평균값
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class ArrayAverage {

    public static void main(String[] args) {
        ArrayAverage arrayAverage = new ArrayAverage();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(arrayAverage.solution(numbers));
    }

    /**
     * 0 ≤ numbers 의 원소 ≤ 1,000
     * 1 ≤ numbers 의 길이 ≤ 100
     * 정답의 소수 부분이 .0 또는 .5인 경우만 입력으로 주어집니다.
     */
    public double solution(int[] numbers) {
        double answer = 0;

        for(int i : numbers){
            answer += i;
        }

        answer = answer / numbers.length;

        return answer;
    }

}
