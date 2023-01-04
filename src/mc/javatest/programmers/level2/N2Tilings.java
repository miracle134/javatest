/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : N2Tilings
 * author         : MiracleCat
 * date           : 2023-01-02
 * description    : 2&N 타일링
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-02        MiracleCat       최초 생성
 */
public class N2Tilings {

    public static void main(String[] args) {
        N2Tilings n2Tilings = new N2Tilings();

        int n = 100;

        System.out.println(n2Tilings.solution(n));
    }

    /**
     * 가로의 길이 n은 60,000이하의 자연수 입니다.
     * 경우의 수가 많아 질 수 있으므로, 경우의 수를 1,000,000,007으로 나눈 나머지를 return 해주세요.
     */
    public int solution(int n) {
        int answer = 0;
        int first = 0;
        int second = 1;

        for(int i = 0; i < n; i++){
            answer = (first + second) % 1000000007;
            first = second;
            second = answer;
        }

        return answer;
    }

}
