/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : NumberCompare
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 숫자 비교하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class NumberCompare {

    public static void main(String[] args) {
        NumberCompare numberCompare = new NumberCompare();

        int num1 = 2;
        int num2 = 3;

        System.out.println(numberCompare.solution(num1, num2));
    }

    /**
     * -50,000 ≤ num1 ≤ 50,000
     * -50,000 ≤ num2 ≤ 50,000
     */
    public int solution(int num1, int num2) {
        int answer = num1 == num2 ? 1 : -1;
        return answer;
    }

}
