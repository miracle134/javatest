/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : PizzaDivision
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 피자 나눠 먹기 (1)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class PizzaDivision {

    public static void main(String[] args) {
        PizzaDivision pizzaDivision = new PizzaDivision();

        int n = 1;

        System.out.println(pizzaDivision.solution(n));
    }

    /**
     * 1 ≤ n ≤ 100
     */
    public int solution(int n) {
        int answer = n % 7 != 0 ? n / 7 + 1 : n / 7;
        return answer;
    }

}
