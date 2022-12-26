/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

import java.util.Arrays;
import java.util.HashMap;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : TheNearestIdenticalLetter
 * author         : MiracleCat
 * date           : 2022-12-16
 * description    : 가장 가까운 같은 글자
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-16        MiracleCat       최초 생성
 */
public class TheNearestIdenticalLetter {

    public static void main(String[] args) {
        TheNearestIdenticalLetter theNearestIdenticalLetter = new TheNearestIdenticalLetter();

        String s = "banana";

        System.out.println(Arrays.toString(theNearestIdenticalLetter.solution(s)));
    }

    /**
     * 1 ≤ s의 길이 ≤ 10,000
     * s은 영어 소문자로만 이루어져 있습니다.
     *
     * @param s
     * @return
     */
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < answer.length; i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0));
            int tmp = hm.get(c);

            // 현재 위치 비교 값
            if (tmp == 0) {
                answer[i] = -1;
            } else {
                answer[i] = hm.get(c);
                hm.put(c, 0);
            }
            
            // 모든 키 +1
            for (Character cha : hm.keySet()) {
                hm.put(cha, hm.get(cha) + 1);
            }

        }

        return answer;
    }

}
