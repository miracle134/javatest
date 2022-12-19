/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : DivideStrings
 * author         : MiracleCat
 * date           : 2022-12-17(017)
 * description    : 문자열 나누기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-17(017)        MiracleCat       최초 생성
 */
public class DivideStrings {

    public static void main(String[] args) {
        DivideStrings divideStrings = new DivideStrings();

        String s = "aaabbaccccabba";

        System.out.println(divideStrings.solution(s));
    }

    /**
     * 1 ≤ s의 길이 ≤ 10,000
     * s는 영어 소문자로만 이루어져 있습니다
     *
     * @param s
     * @return
     */
    public int solution(String s) {
        int answer = 0;
        char cur = s.charAt(0);
        int a = 0, b = 0;

        for (int i = 0; i < s.length(); i++) {

            // 최초 진입이면 새로운 값
            if(a == 0) cur = s.charAt(i);

            // 같은 문자
            if (cur == s.charAt(i)) {
                a++;
            } else { // 다른 문자
                b++;
            }

            // 갯수 같다면
            if (a == b){

                // 글자 나누고 초기화
                answer++;
                a = 0;
                b = 0;
            }

        }

        // 글자 갯수 다르게 종료됐다면 최종적으로 +1
        if(a != b) answer++;

        return answer;
    }

}
