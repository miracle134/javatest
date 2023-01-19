/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : OverlappingLine
 * author         : MiracleCat
 * date           : 2023-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-19        MiracleCat       최초 생성
 */
public class OverlappingLine {

    public static void main(String[] args) {
        OverlappingLine overlappingLine = new OverlappingLine();

//        int[][] lines = {{-3, -1}, {-2, 1}, {0, 2}};
//        int[][] lines = {{-1, 1}, {1, 3}, {3, 9}};
//        int[][] lines = {{0, 5}, {3, 9}, {1, 10}};
        int[][] lines = {{0, 1}, {2, 5}, {3, 9}};

        System.out.println(overlappingLine.solution(lines));
    }

    /**
     * lines 의 길이 = 3
     * lines 의 원소의 길이 = 2
     * 모든 선분은 길이가 1 이상입니다.
     * lines 의 원소는 [a, b] 형태이며, a, b는 각각 선분의 양 끝점 입니다.
     * -100 ≤ a < b ≤ 100
     */
    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[200];

        for (int[] i : lines) {
            System.out.println(Math.abs(i[0] + 100));
            System.out.println(Math.abs(i[1] + 100));
            for (int j = Math.abs(i[0] + 100); j < Math.abs(i[1] + 100); j++) {
                arr[j]++;
            }
        }

        for (int i : arr) {
            if (i > 1) answer++;
        }

        return answer;
    }

}
