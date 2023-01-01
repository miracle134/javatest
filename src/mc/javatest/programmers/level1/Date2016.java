/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : Date2016
 * author         : MiracleCat
 * date           : 2023-01-01(001)
 * description    : 2016년
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-01(001)        MiracleCat       최초 생성
 */
public class Date2016 {

    public static void main(String[] args) {
        Date2016 date2016 = new Date2016();

        int a = 5;
        int b = 24;

        System.out.println(date2016.solution(a, b));
    }

    /**
     * 2016년은 윤년입니다.
     * 2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)
     */
    public String solution(int a, int b) {
        String answer = "";

        LocalDate ld = LocalDate.of(2016, Month.of(a), b);

        answer = ld.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();

        return answer;
    }

}
