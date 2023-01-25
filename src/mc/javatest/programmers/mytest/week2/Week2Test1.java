/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week2;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.mytest.week2
 * fileName       : Week2Test1
 * author         : MiracleCat
 * date           : 2023-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-18        MiracleCat       최초 생성
 */
public class Week2Test1 {

    public static void main(String[] args) throws Exception {
        Week2Test1 week2Test1 = new Week2Test1();

        String[][] booked = {{"09:10", "lee"}, {"09:05", "bae"}};
        String[][] unbooked = {{"09:00", "kim"}};

        System.out.println("리턴 값 : " + Arrays.toString(week2Test1.solution(booked, unbooked)));

    }

    static int pivotTime = 0;

    public String[] solution(String[][] booked, String[][] unbooked) {
        String[] answer = new String[booked.length + unbooked.length];
        int bookedIndex = 0;
        int unbookedIndex = 0;
        int answerIndex = 0;

        while (answerIndex < booked.length + unbooked.length) {

            if (bookedIndex < booked.length && unbookedIndex < unbooked.length
                    && calculationTime(booked[bookedIndex][0], unbooked[unbookedIndex][0])) {
                answer[answerIndex] = booked[bookedIndex][1];
                bookedIndex++;
            } else if (bookedIndex < booked.length && unbookedIndex >= unbooked.length) {
                answer[answerIndex] = booked[bookedIndex][1];
                bookedIndex++;
            } else {
                answer[answerIndex] = unbooked[unbookedIndex][1];
                unbookedIndex++;
            }

            answerIndex++;
        }

        return answer;
    }

    private int sumTime(String time) {
        String[] t = time.split(":");

        return Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
    }

    private boolean calculationTime(String book, String unbook) {
        int time1 = sumTime(book);
        int time2 = sumTime(unbook);

        if (pivotTime == 0) { // 최초 시작
            if (time1 <= time2) {
                pivotTime = time1 + 10;
                return true;
            } else {
                pivotTime = time2 + 10;
                return false;
            }
        } else {
            if (pivotTime >= time1) { // 기준시간 >= 우선예약
                pivotTime += 10;
                return true;
            } else if (time1 <= time2) { // 우선예약 <= 일반예약
                pivotTime = time1 + 10;
                return true;
            } else if (pivotTime >= time2) { // 기준시간 >= 일반예약
                pivotTime += 10;
                return false;
            } else {
                pivotTime = time2 + 10;
                return false;
            }
        }

    }

}
