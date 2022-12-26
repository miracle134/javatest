/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : PizzaDivision3
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 피자 나눠 먹기 (3)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class PizzaDivision3 {

    public static void main(String[] args) {
        PizzaDivision3 pizzaDivision3 = new PizzaDivision3();

        int slice = 7;
        int n = 10;

        System.out.println(pizzaDivision3.solution(slice, n));
    }

    /**
     * 2 ≤ slice ≤ 10
     * 1 ≤ n ≤ 100
     */
    public int solution(int slice, int n) {
        int answer = n % slice != 0 ? n / slice + 1 : n / slice;
        return answer;
    }

}
