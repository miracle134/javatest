/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : Babbling
 * author         : MiracleCat
 * date           : 2022-12-16
 * description    : 옹알이 (1)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-16        MiracleCat       최초 생성
 */
public class Babbling {

    public static void main(String[] args){
        Babbling babbling = new Babbling();

        String[] b = {"aya", "yee", "u", "maa", "wyeoo"};

        System.out.println(babbling.solution(b));
    }

    /**
     * 1 ≤ babbling의 길이 ≤ 100
     * 1 ≤ babbling[i]의 길이 ≤ 15
     * babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
     * 즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
     * 문자열은 알파벳 소문자로만 이루어져 있습니다.
     *
     * @param babbling
     * @return
     */
    public int solution(String[] babbling) {
        int answer = 0;

        // 기본 값 aya ye woo ma
        // 정규식을 통한 문자 체크
        for (String s : babbling) {
            s = s.replaceAll("aya", " ");
            s = s.replaceAll("ye", " ");
            s = s.replaceAll("woo", " ");
            s = s.replaceAll("ma", " ");
            s = s.trim();

            // 빈 문자열이 되면 발음할 수 있다
            if("".equals(s)) answer++;
        }

        return answer;
    }

}
