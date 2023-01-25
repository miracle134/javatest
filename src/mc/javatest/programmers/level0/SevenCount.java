/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : SevenCount
 * author         : MiracleCat
 * date           : 2023-01-19
 * description    : 7의 개수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-19        MiracleCat       최초 생성
 */
public class SevenCount {

    public static void main(String[] args) {
        SevenCount sevenCount = new SevenCount();

        int[] array = {7, 77, 17};

        System.out.println(sevenCount.solution(array));
    }

    /**
     * 1 ≤ array 의 길이 ≤ 100
     * 0 ≤ array 의 원소 ≤ 100,000
     */
    public int solution(int[] array) {
        String seven = IntStream.of(array).mapToObj(String::valueOf)
                .map(v -> v.replaceAll("[^7]", ""))
                .collect(Collectors.joining());
        return seven.length();
    }

}