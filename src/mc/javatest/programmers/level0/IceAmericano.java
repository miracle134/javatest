/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : IceAmericano
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 아이스 아메리카노
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class IceAmericano {

    public static void main(String[] args) {
        IceAmericano iceAmericano = new IceAmericano();

        int money = 15000;

        System.out.println(Arrays.toString(iceAmericano.solution(money)));
    }

    /**
     * 0 < money ≤ 1,000,000
     */
    public int[] solution(int money) {
        int[] answer = new int[2];

        answer[0] = money / 5500;
        answer[1] = money % 5500;

        return answer;
    }

}
