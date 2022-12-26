/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : Letter
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 편지
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class Letter {

    public static void main(String[] args) {
        Letter letter = new Letter();

        String message = "happy birthday!"	;

        System.out.println(letter.solution(message));
    }

    /**
     * 공백도 하나의 문자로 취급합니다.
     * 1 ≤ message의 길이 ≤ 50
     * 편지지의 여백은 생각하지 않습니다.
     * message는 영문 알파벳 대소문자, ‘!’, ‘~’ 또는 공백으로만 이루어져 있습니다.
     */
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }

}
