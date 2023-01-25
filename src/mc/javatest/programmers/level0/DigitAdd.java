/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : DigitAdd
 * author         : MiracleCat
 * date           : 2023-01-19
 * description    : 자릿수 더하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-19        MiracleCat       최초 생성
 */
public class DigitAdd {

    public static void main(String[] args) {
        NumberOrderedPairs numberOrderedPairs = new NumberOrderedPairs();

        int n = 1234;

        System.out.println(numberOrderedPairs.solution(n));
    }

    /**
     * 0 ≤ n ≤ 1,000,000
     */
    public int solution(int n) {
        int answer = 0;

        String[] srr = String.valueOf(n).split("");

        for (String s : srr) answer += Integer.parseInt(s);

        return answer;
    }

}
