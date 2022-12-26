/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : TwoSum
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 두 수의 합
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int num1 = 2;
        int num2 = 3;

        System.out.println(twoSum.solution(num1, num2));
    }

    /**
     * -50,000 ≤ num1 ≤ 50,000
     * -50,000 ≤ num2 ≤ 50,000
     */
    public int solution(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

}
