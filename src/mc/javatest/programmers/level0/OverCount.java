/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : OverCount
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 중복된 숫자 개수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class OverCount {

    public static void main(String[] args) {
        OverCount overCount = new OverCount();

        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;

        System.out.println(overCount.solution(array, n));
    }

    /**
     * 1 ≤ array 의 길이 ≤ 100
     * 0 ≤ array 의 원소 ≤ 1,000
     * 0 ≤ n ≤ 1,000
     */
    public int solution(int[] array, int n) {
        int answer = 0;

        for(int i : array){
            if(i == n) answer++;
        }

        return answer;
    }

}
