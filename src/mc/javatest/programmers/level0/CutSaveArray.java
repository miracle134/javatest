/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : CutSaveArray
 * author         : MiracleCat
 * date           : 2023-01-04
 * description    : addressSearch
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-04        MiracleCat       최초 생성
 */
public class CutSaveArray {

    public static void main(String[] args) {
        CutSaveArray cutSaveArray = new CutSaveArray();

        String my_str = "abc1Addfggg4556b";
        int n = 6;

        System.out.println(Arrays.toString(cutSaveArray.solution(my_str, n)));
    }

    /**
     * 1 ≤ my_str 의 길이 ≤ 100
     * 1 ≤ n ≤ my_str 의 길이
     * my_str 은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
     */
    public String[] solution(String my_str, int n) {
        String[] answer =
                new String[my_str.length() % n == 0
                        ? my_str.length() / n
                        : my_str.length() / n + 1];

        for (int i = 0; i < answer.length; i++) {
            if (i < answer.length - 1) {
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            } else {
                answer[i] = my_str.substring(i * n);
            }
        }

        return answer;
    }

}
