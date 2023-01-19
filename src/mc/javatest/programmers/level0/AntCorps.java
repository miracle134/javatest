/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : AntCorps
 * author         : MiracleCat
 * date           : 2023-01-19
 * description    : 개미 군단
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-19        MiracleCat       최초 생성
 */
public class AntCorps {

    public static void main(String[] args) {
        AntCorps antCorps = new AntCorps();

        int hp = 23;

        System.out.println(antCorps.solution(hp));
    }

    /**
     * hp는 자연수입니다.
     * 0 ≤ hp ≤ 1000
     */
    public int solution(int hp) {
        int answer = 0;

        answer += hp / 5;
        answer += hp % 5 / 3;
        answer += hp % 5 % 3;

        return answer;
    }

}
