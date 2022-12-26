/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : GetCenterValue
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 중앙값 구하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class GetCenterValue {

    public static void main(String[] args) {
        GetCenterValue getCenterValue = new GetCenterValue();

        int[] array = {1, 2, 7, 10, 11};

        System.out.println(getCenterValue.solution(array));
    }

    /**
     * array 의 길이는 홀수입니다.
     * 0 < array 의 길이 < 100
     * -1,000 < array 의 원소 < 1,000
     */
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);

        answer = array[array.length / 2];

        return answer;
    }

}
