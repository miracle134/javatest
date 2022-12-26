/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : StringReverse
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 문자열 뒤집기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class StringReverse {

    public static void main(String[] args) {
        StringReverse stringReverse = new StringReverse();

        String my_string = "jaron";

        System.out.println(stringReverse.solution(my_string));
    }

    /**
     * 1 ≤ my_string의 길이 ≤ 1,000
     */
    public String solution(String my_string) {
        String answer = "";

        for(int i = my_string.length()-1; i >= 0; i--){
            answer += my_string.charAt(i);
        }

        return answer;
    }

}
