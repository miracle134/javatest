/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : CokeProblem
 * author         : MiracleCat
 * date           : 2023-01-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-06        MiracleCat       최초 생성
 */
public class CokeProblem {

    public static void main(String[] args) {
        CokeProblem cokeProblem = new CokeProblem();

        int a = 3;
        int b = 1;
        int n = 20;

        System.out.println(cokeProblem.solution(a, b, n));
    }

    /**
     * 1 ≤ b < a ≤ n ≤ 1,000,000
     * 정답은 항상 int 범위를 넘지 않게 주어집니다.
     */
    public int solution(int a, int b, int n) {
        int answer = 0;
        int mok;
        /**
         * n = 최초 빈병
         * a만큼 줄때마다 b만큼 돌려줌
         * n / a : 몫 * b + n % a
         * 몫 + ... = 총 콜라 받은 개수
         */
        while (n >= a) {
            mok = n / a * b;
            answer += mok;
            n = mok + n % a;
        }

        return answer;
    }
}
