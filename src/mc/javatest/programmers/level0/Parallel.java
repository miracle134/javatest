/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : Parallel
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 평행
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class Parallel {

    public static void main(String[] args) {
        Parallel parallel = new Parallel();

        int[][] dots = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};

        System.out.println(parallel.solution(dots));
    }

    /**
     * 0 ≤ dots 의 원소 ≤ 100
     * dots 의 길이 = 4
     * dots 의 원소의 길이 = 2
     * dots 의 원소는 [x, y] 형태이며 x, y는 정수입니다.
     * 서로 다른 두개 이상의 점이 겹치는 경우는 없습니다.
     * 두 직선이 겹치는 경우(일치하는 경우)에도 1을 return 해주세요.
     * 임의의 두 점을 이은 직선이 x축 또는 y축과 평행한 경우는 주어지지 않습니다.
     */
    public int solution(int[][] dots) {
        int answer = 0;

        /**
         * X : dots[0][0] dots[1][0] dots[2][0] dots[3][0]
         * Y : dots[0][1] dots[1][1] dots[2][1] dots[3][1]
         * 기울기 = y2-y1 / x2-x1
         */
        if((double)Math.abs(dots[0][1]-dots[1][1]) / Math.abs(dots[0][0]-dots[1][0])
            == (double)Math.abs(dots[2][1]-dots[3][1]) / Math.abs(dots[2][0]-dots[3][0])
        || (double)Math.abs(dots[0][1]-dots[2][1]) / Math.abs(dots[0][0]-dots[2][0])
            == (double)Math.abs(dots[1][1]-dots[3][1]) /Math.abs(dots[1][0]-dots[3][0])
        || (double)Math.abs(dots[0][1]-dots[3][1]) / Math.abs(dots[0][0]-dots[3][0])
            == (double)Math.abs(dots[1][1]-dots[2][1]) /Math.abs(dots[1][0]-dots[2][0]))
            answer = 1;

        return answer;
    }

}
