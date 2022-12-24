/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.ArrayDeque;
import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : SumConsecutiveNumbers
 * author         : MiracleCat
 * date           : 2022-12-24(024)
 * description    : 연속된 수의 합
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-24(024)        MiracleCat       최초 생성
 */
public class SumConsecutiveNumbers {

    public static void main(String[] args) {
        SumConsecutiveNumbers sumConsecutiveNumbers = new SumConsecutiveNumbers();

        int num = 3;
        int total = 12;

        System.out.println(Arrays.toString(sumConsecutiveNumbers.solution(num, total)));
    }

    /**
     * 1 ≤ num ≤ 100
     * 0 ≤ total ≤ 1000
     * num 개의 연속된 수를 더하여 total 이 될 수 없는 테스트 케이스는 없습니다.
     *
     * @param num   연속된 수 개수
     * @param total 합
     * @return int 배열
     */
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        int sum = 0;

        // 초기 값
        for (int i = 1001 - num; i <= 1000; i++) {
            dq.add(i);
            sum += i;
        }

        int j = 1000 - num;
        while (sum != total) {
            {
                int tmp = dq.pollLast();
                dq.addFirst(j);

                sum -= tmp;
                sum += j;
                j--;
            }
        }

        for (int i = 0; i < answer.length; i++) {
            answer[i] = dq.pollFirst();
        }

        return answer;
    }

}
