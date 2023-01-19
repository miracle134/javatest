/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : NumberOrderedPairs
 * author         : MiracleCat
 * date           : 2023-01-19
 * description    : 순서쌍 개수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-19        MiracleCat       최초 생성
 */
public class NumberOrderedPairs {

    public static void main(String[] args) {
        NumberOrderedPairs numberOrderedPairs = new NumberOrderedPairs();

        int n = 20;

        System.out.println(numberOrderedPairs.solution(n));
    }

    /**
     * 1 ≤ n ≤ 1,000,000
     */
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0) answer++;
        }

        return answer;
    }

}
