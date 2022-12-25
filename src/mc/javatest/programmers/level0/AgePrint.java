/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : TwoMultiplication
 * author         : MiracleCat
 * date           : 2022-12-25(025)
 * description    : 나이 출력
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-25(025)        MiracleCat       최초 생성
 */
public class AgePrint {

    public static void main(String[] args) {
        AgePrint twoRest = new AgePrint();

        int age = 40;

        System.out.println(twoRest.solution(age));
    }

    /**
     * 0 < age ≤ 120
     * 나이는 태어난 연도에 1살이며 1년마다 1씩 증가합니다.
     * age = 1 , result = 2022
     */
    public int solution(int age) {
        int answer = 2023 - age;
        return answer;
    }

}
