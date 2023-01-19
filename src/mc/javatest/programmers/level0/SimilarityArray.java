/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;
import java.util.List;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : SimilarityArray
 * author         : MiracleCat
 * date           : 2023-01-19
 * description    : 배열의 유사도
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-19        MiracleCat       최초 생성
 */
public class SimilarityArray {

    public static void main(String[] args) {
        SimilarityArray similarityArray = new SimilarityArray();

        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        System.out.println(similarityArray.solution(s1, s2));
    }

    /**
     * 1 ≤ s1, s2의 길이 ≤ 100
     * 1 ≤ s1, s2의 원소의 길이 ≤ 10
     * s1과 s2의 원소는 알파벳 소문자로만 이루어져 있습니다
     * s1과 s2는 각각 중복된 원소를 갖지 않습니다.
     */
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        List<String> list2 = Arrays.asList(s2);

        for(String s : s1) {
            if(list2.contains(s)) answer++;
        }

        return answer;
    }

}
