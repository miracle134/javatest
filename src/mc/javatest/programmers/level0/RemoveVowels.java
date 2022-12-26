/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : RemoveVowels
 * author         : MiracleCat
 * date           : 2022-12-16
 * description    : 모음 제거
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-16        MiracleCat       최초 생성
 */
public class RemoveVowels {

    public static void main(String[] args){
        RemoveVowels removeVowels = new RemoveVowels();

        String my_string = "bus";

        System.out.println(removeVowels.solution(my_string));
    }

    /**
     * my_string은 소문자와 공백으로 이루어져 있습니다.
     * 1 ≤ my_string의 길이 ≤ 1,000
     *
     * @param my_string
     * @return
     */
    public String solution(String my_string) {
        String answer = "";

        // 정규식을 통한 모음 삭제
        answer = my_string.replaceAll("[aeiou]", "");

        return answer;
    }

}
