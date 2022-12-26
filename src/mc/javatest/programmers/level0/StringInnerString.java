/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : StringInnerString
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 문자열안에 문자열
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class StringInnerString {

    public static void main(String[] args) {
        StringInnerString stringInnerString = new StringInnerString();

        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD"	;

        System.out.println(stringInnerString.solution(str1, str2));
    }

    /**
     * 1 ≤ str1의 길이 ≤ 100
     * 1 ≤ str2의 길이 ≤ 100
     */
    public int solution(String str1, String str2) {
        int answer = 0;

        if(str1.contains(str2)) answer = 1;
        else answer = 2;

        return answer;
    }

}
