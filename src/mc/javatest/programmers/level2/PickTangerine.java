/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : PickTangerine
 * author         : MiracleCat
 * date           : 2022-12-19(019)
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-19(019)        MiracleCat       최초 생성
 */
public class PickTangerine {

    public static void main(String[] args) {
        PickTangerine pickTangerine = new PickTangerine();

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        System.out.println(pickTangerine.solution(k, tangerine));
    }

    /**
     * 1 ≤ k ≤ tangerine의 길이 ≤ 100,000
     * 1 ≤ tangerine의 원소 ≤ 10,000,000
     *
     * @param k
     * @param tangerine
     * @return
     */
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        // 정렬
        Arrays.sort(tangerine);
        System.out.println(Arrays.toString(tangerine));

        int tmp = 0;
        for (int i = tangerine.length - 1; i >= 0; i--) {
            System.out.println(tangerine[i]);
            if ((tmp == 0 || tmp != tangerine[i]) && k > 0) {
                tmp = tangerine[i];
                answer++;
            }

            if(--k == 0) break;
        }

        return answer;
    }

}
