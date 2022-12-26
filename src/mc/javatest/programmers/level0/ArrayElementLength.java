/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : ArrayElementLength
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 배열 원소의 길이
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class ArrayElementLength {

    public static void main(String[] args) {
        ArrayElementLength arrayElementLength = new ArrayElementLength();

        String[] strlist = {"We", "are", "the", "world!"};

        System.out.println(Arrays.toString(arrayElementLength.solution(strlist)));
    }

    /**
     * 1 ≤ strlist 원소의 길이 ≤ 100
     * strlist는 알파벳 소문자, 대문자, 특수문자로 구성되어 있습니다.
     */
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for (int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }

        return answer;
    }

}
