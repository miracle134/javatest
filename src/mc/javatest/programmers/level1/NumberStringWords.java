/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : NumberStringWords
 * author         : MiracleCat
 * date           : 2023-01-18
 * description    : 숫자 문자열 영단어
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-18        MiracleCat       최초 생성
 */
public class NumberStringWords {

    public static void main(String[] args) {
        NumberStringWords numberStringWords = new NumberStringWords();

        String s = "one4zeroseveneightzero";

        System.out.println(numberStringWords.solution(s));
    }

    public int solution(String s) {
        s = s.replace("zero", "0")
                .replaceAll("one", "1")
                .replaceAll("two", "2")
                .replaceAll("three", "3")
                .replaceAll("four", "4")
                .replaceAll("five", "5")
                .replaceAll("six", "6")
                .replaceAll("seven", "7")
                .replaceAll("eight", "8")
                .replaceAll("nine", "9");

        return Integer.parseInt(s);
    }

}
