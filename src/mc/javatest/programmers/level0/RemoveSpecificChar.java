/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : RemoveSpecificChar
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 특정 문자 제거하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class RemoveSpecificChar {

    public static void main(String[] args) {
        RemoveSpecificChar removeSpecificChar = new RemoveSpecificChar();

        String my_string = "abcdef";
        String letter = "f";

        System.out.println(removeSpecificChar.solution(my_string, letter));
    }

    /**
     * 1 ≤ my_string 의 길이 ≤ 100
     * letter 은 길이가 1인 영문자입니다.
     * my_string 과 letter 은 알파벳 대소문자로 이루어져 있습니다.
     * 대문자와 소문자를 구분합니다.
     */
    public String solution(String my_string, String letter) {
        String answer = my_string.replaceAll(letter, "");
        return answer;
    }

}
