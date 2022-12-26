/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : TwoMultiplication
 * author         : MiracleCat
 * date           : 2022-12-25(025)
 * description    : 두 수의 차
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-25(025)        MiracleCat       최초 생성
 */
public class TwoSubtract {

    public static void main(String[] args) {
        TwoSubtract twoSubtract = new TwoSubtract();

        int num1 = 2;
        int num2 = 3;

        System.out.println(twoSubtract.solution(num1, num2));
    }

    /**
     * 0 ≤ num1 ≤ 100
     * 0 ≤ num2 ≤ 100
     */
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

}
