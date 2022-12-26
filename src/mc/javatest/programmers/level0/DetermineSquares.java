/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : DetermineSquares
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 제곱수 판별하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class DetermineSquares {

    public static void main(String[] args) {
        DetermineSquares determineSquares = new DetermineSquares();

        int n = 976;

        System.out.println(determineSquares.solution(n));
    }

    /**
     * 1 ≤ n ≤ 1,000,000
     */
    public int solution(int n) {
        int answer = 0;
        int sqrt = (int)Math.sqrt(n);

        if(sqrt * sqrt == n) answer = 1;
        else answer = 2;

        return answer;
    }

}
