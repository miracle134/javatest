/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : EvenNumberSum
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 짝수의 합
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class EvenNumberSum {

    public static void main(String[] args) {
        EvenNumberSum evenNumberSum = new EvenNumberSum();

        int n = 10;

        System.out.println(evenNumberSum.solution(n));
    }

    /**
     * 0 < n ≤ 1000
     */
    public int solution(int n) {
        int answer = 0;

        n = n % 2 == 0 ? n : n-1;

        for(int i = n; i > 0; i -= 2){
            answer += i;
        }

        return answer;
    }

}
