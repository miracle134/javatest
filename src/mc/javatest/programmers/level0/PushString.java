/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : PushString
 * author         : MiracleCat
 * date           : 2022-12-25(025)
 * description    : 문자열 밀기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-25(025)        MiracleCat       최초 생성
 */
public class PushString {


    public static void main(String[] args) {
        PushString pushString = new PushString();

        String A = "hello";
        String B = "ohell";

        System.out.println(pushString.solution(A, B));
    }

    /**
     * 0 < A의 길이 = B의 길이 < 100
     * A, B는 알파벳 소문자로 이루어져 있습니다.
     */
    public int solution(String A, String B) {
        int answer = 0;

        // A와 B가 같으면 0
        if(B.equals(A)) return answer;

        // A길이의 -1까지 반복
        for(int i=0; i<A.length(); i++){
            char tmp = A.charAt(A.length()-1);
            A = tmp + A.substring(0,A.length()-1);

            answer++;
            if(B.equals(A)) break;
        }

        // A는 B가 될 수 없음
        if(answer == A.length()) answer = -1;

        return answer;
    }

}
