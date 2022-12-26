/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : Protractor
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 각도기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class Protractor {

    public static void main(String[] args) {
        Protractor protractor = new Protractor();

        int angle = 70;

        System.out.println(protractor.solution(angle));
    }

    /**
     * 예각 : 0 < angle < 90
     * 직각 : angle = 90
     * 둔각 : 90 < angle < 180
     * 평각 : angle = 180
     */
    public int solution(int angle) {
        int answer = 0;

        if(angle < 90) answer = 1;
        else if(angle == 90) answer = 2;
        else if(angle < 180) answer = 3;
        else if(angle == 180) answer = 4;

        return answer;
    }

}
