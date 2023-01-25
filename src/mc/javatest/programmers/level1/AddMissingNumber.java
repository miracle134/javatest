/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

import java.util.stream.IntStream;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : AddMissingNumber
 * author         : MiracleCat
 * date           : 2023-01-17
 * description    : 없는 숫자 더하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-17        MiracleCat       최초 생성
 */
public class AddMissingNumber {

    public static void main(String[] args) {
        AddMissingNumber addMissingNumber = new AddMissingNumber();

        int[] n = {1,2,0,5,8,4};

        System.out.println(addMissingNumber.solution(n));
    }

    /**
     * 1 ≤ numbers 의 길이 ≤ 9
     * 0 ≤ numbers 의 모든 원소 ≤ 9
     * numbers 의 모든 원소는 서로 다릅니다.
     */
    public int solution(int[] numbers) {
        return 45 - IntStream.of(numbers).sum();
    }

}
