/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : TwoDivision
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 두 수 나누기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class TwoDivision {

    public static void main(String[] args) {
        TwoDivision twoDivision = new TwoDivision();

        int num1 = 1;
        int num2 = 16;

        System.out.println(twoDivision.solution(num1, num2));
    }

    /**
     * 0 < num1 ≤ 100
     * 0 < num2 ≤ 100
     */
    public int solution(int num1, int num2) {
        int answer = (int)((double) num1 / num2 * 1000);
        return answer;
    }

}
