/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : PersonalInformationCollection
 * author         : MiracleCat
 * date           : 2023-01-06
 * description    : 개인정보 수집 유효기간
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-06        MiracleCat       최초 생성
 */
public class PersonalInformationCollection {

    public static void main(String[] args) {
        PersonalInformationCollection personalInformationCollection = new PersonalInformationCollection();

        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        System.out.println(Arrays.toString(personalInformationCollection.solution(today, terms, privacies)));
    }

    /**
     * today YYYY.MM.DD
     * 월 길이 28
     * 1. 파기 기한 - > 일수로 변경
     * 2. 1년 - > 일수로 변경
     * 3. 같은 연도 - > today(월일) - 대상(월일) : 파기기한 비교
     * 4. 다른 연도 - > (연도차이*일수) - 대상(월일) + today(월일) : 파기기한 비교
     */
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>(privacies.length);
        int yearToDay = 12 * 28;
        int toYear = Integer.parseInt(today.split("\\.")[0]);
        int toMonDay = dateToDay(today);
        HashMap<String, Integer> hm = new HashMap<>();

        for (String s : terms) {
            String[] srr = s.split(" ");
            hm.put(srr[0], Integer.parseInt(srr[1]) * 28);
        }

        for (int i = 0; i < privacies.length; i++) {
            int tmpYear = Integer.parseInt(privacies[i].split("\\.")[0]);
            String term = privacies[i].split(" ")[1];
            int tmpDays;

            if (toYear == tmpYear) {
                tmpDays = toMonDay - dateToDay(privacies[i].split(" ")[0]);
            } else {
                tmpDays = yearToDay * (toYear - tmpYear) - dateToDay(privacies[i].split(" ")[0]) + toMonDay;
            }

            if (tmpDays >= hm.get(term)) {
                list.add(i + 1);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public int dateToDay(String date) {
        String[] d = date.split("\\.");

        return Integer.parseInt(d[1]) * 28 + Integer.parseInt(d[2]);
    }

}
