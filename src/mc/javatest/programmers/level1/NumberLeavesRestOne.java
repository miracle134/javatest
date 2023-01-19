/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : NumberLeavesRestOne
 * author         : MiracleCat
 * date           : 2023-01-10
 * description    : 나머지가 1이 되는 수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        MiracleCat       최초 생성
 */
public class NumberLeavesRestOne {

    public static void main(String[] args) {
        NumberLeavesRestOne numberLeavesRestOne = new NumberLeavesRestOne();

        int n = 10;

        System.out.println(numberLeavesRestOne.solution(n));
    }

    /**
     * 3 ≤ n ≤ 1,000,000
     */
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}

