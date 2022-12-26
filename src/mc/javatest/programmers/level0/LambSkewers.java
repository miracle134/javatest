/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : LambSkewers
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 양꼬치
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class LambSkewers {

    public static void main(String[] args) {
        LambSkewers lambSkewers = new LambSkewers();

        int n = 64;
        int k = 6;

        System.out.println(lambSkewers.solution(n, k));
    }

    /**
     * 0 < n < 1,000
     * n / 10 ≤ k < 1,000
     * 서비스로 받은 음료수는 모두 마십니다.
     */
    public int solution(int n, int k) {
        int answer = 0;
        int free = n / 10;

        answer = n * 12000 + (k-free) * 2000;

        return answer;
    }

}
