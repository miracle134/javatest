/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : StringForPrint
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 문자 반복 출력하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class StringForPrint {

    public static void main(String[] args) {
        StringForPrint stringForPrint = new StringForPrint();

        String my_string = "hello";
        int n = 3;

        System.out.println(stringForPrint.solution(my_string, n));
    }

    /**
     * 2 ≤ my_string 길이 ≤ 5
     * 2 ≤ n ≤ 10
     * "my_string"은 영어 대소문자로 이루어져 있습니다.
     */
    public String solution(String my_string, int n) {
        String answer = "";

        for(String s : my_string.split("")){
            answer += s.repeat(n);
        }

        return answer;
    }

}
