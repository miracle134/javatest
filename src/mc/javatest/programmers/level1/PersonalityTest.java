/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

import java.util.HashMap;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : PersonalityTest
 * author         : MiracleCat
 * date           : 2023-01-10
 * description    : 성격 유형 검사하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        MiracleCat       최초 생성
 */
public class PersonalityTest {

    public static void main(String[] args) {
        PersonalityTest personalityTest = new PersonalityTest();

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        System.out.println(personalityTest.solution(survey, choices));
    }

    /**
     * 1 ≤ survey 의 길이 ( = n) ≤ 1,000
     * survey 의 원소는 "RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA" 중 하나입니다.
     * survey[i]의 첫 번째 캐릭터는 i+1번 질문의 비동의 관련 선택지를 선택하면 받는 성격 유형을 의미합니다.
     * survey[i]의 두 번째 캐릭터는 i+1번 질문의 동의 관련 선택지를 선택하면 받는 성격 유형을 의미합니다.
     * choices 의 길이 = survey 의 길이
     * choices[i]는 검사자가 선택한 i+1번째 질문의 선택지를 의미합니다.
     * 1 ≤ choices 의 원소 ≤ 7
     */
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        init(hm);

        for (int i = 0; i < survey.length; i++) {
            getScore(hm, survey[i], choices[i]);
        }

        answer += hm.get("R") < hm.get("T") ? "T" : "R";
        answer += hm.get("C") < hm.get("F") ? "F" : "C";
        answer += hm.get("J") < hm.get("M") ? "M" : "J";
        answer += hm.get("A") < hm.get("N") ? "N" : "A";

        return answer;
    }

    /**
     * 기본 유형지
     */
    private void init(HashMap<String, Integer> hm) {
        hm.put("R", 0);
        hm.put("T", 0);
        hm.put("C", 0);
        hm.put("F", 0);
        hm.put("J", 0);
        hm.put("M", 0);
        hm.put("A", 0);
        hm.put("N", 0);
    }

    /**
     * 점수 구하기
     */
    private void getScore(HashMap<String, Integer> hm, String survey, int choice) {
        // 점수
        switch (choice) {
            case 1 -> hm.put(String.valueOf(survey.charAt(0))
                    , hm.get(String.valueOf(survey.charAt(0))) + 3);
            case 2 -> hm.put(String.valueOf(survey.charAt(0))
                    , hm.get(String.valueOf(survey.charAt(0))) + 2);
            case 3 -> hm.put(String.valueOf(survey.charAt(0))
                    , hm.get(String.valueOf(survey.charAt(0))) + 1);
            case 5 -> hm.put(String.valueOf(survey.charAt(1))
                    , hm.get(String.valueOf(survey.charAt(1))) + 1);
            case 6 -> hm.put(String.valueOf(survey.charAt(1))
                    , hm.get(String.valueOf(survey.charAt(1))) + 2);
            case 7 -> hm.put(String.valueOf(survey.charAt(1))
                    , hm.get(String.valueOf(survey.charAt(1))) + 3);
        }
    }

}
