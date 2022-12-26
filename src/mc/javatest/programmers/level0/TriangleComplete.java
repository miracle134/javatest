/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : TriangleComplete
 * author         : MiracleCat
 * date           : 2022-12-26
 * description    : 삼각형의 완성조건 (1)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-26        MiracleCat       최초 생성
 */
public class TriangleComplete {

    public static void main(String[] args) {
        TriangleComplete triangleComplete = new TriangleComplete();

        int[] sides = {1, 2, 3};

        System.out.println(triangleComplete.solution(sides));
    }

    /**
     * sides의 원소는 자연수입니다.
     * sides의 길이는 3입니다.
     * 1 ≤ sides의 원소 ≤ 1,000
     */
    public int solution(int[] sides) {
        int answer = 0;

        // 정렬
        Arrays.sort(sides);

        if(sides[2] < sides[0] + sides[1]) answer = 1;
        else answer = 2;

        return answer;
    }

}
