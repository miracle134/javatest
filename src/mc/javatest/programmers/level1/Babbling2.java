/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : Babbling2
 * author         : MiracleCat
 * date           : 2023-01-06
 * description    : 옹알이 (2)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-06        MiracleCat       최초 생성
 */
public class Babbling2 {

    public static void main(String[] args) {
        Babbling2 babbling2 = new Babbling2();

        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        System.out.println(babbling2.solution(babbling));
    }

    /**
     * 1 ≤ babbling 의 길이 ≤ 100
     * 1 ≤ babbling[i]의 길이 ≤ 30
     * 문자열은 알파벳 소문자로만 이루어져 있습니다.
     */
    public int solution(String[] babbling) {
        int answer = 0;

        /**
         * 1. a y w m 으로 시작하지 않으면 안됨
         * 2. 같은 단어 연속으로 못함
         * 3. aya ye woo ma
         */

        for (String s : babbling) {
            if (!String.valueOf(s.charAt(0)).matches("[aywm]")) continue;

            if (checkStartString(s)) answer++;
        }

        return answer;
    }

    private boolean checkStartString(String tmp) {
        String[] speak = {"aya", "ye", "woo", "ma"};
        String lastSpeak = "";
        boolean returnFlag = false;
        boolean checkFlag = true;

        while (checkFlag) {
            checkFlag = false;

            for (String k : speak) {
                if (tmp.startsWith(k)) {
                    checkFlag = true;

                    if (lastSpeak.equals(k)) {
                        checkFlag = false;
                        lastSpeak = "";
                        break;
                    }
                    lastSpeak = k;

                    if (tmp.length() == k.length()) {
                        checkFlag = false;
                        returnFlag = true;
                    } else {
                        tmp = tmp.substring(k.length());
                    }

                    break;
                }
            }
        }

        return returnFlag;
    }

}
