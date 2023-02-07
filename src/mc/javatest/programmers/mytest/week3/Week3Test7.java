/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week3;

/**
 * packageName    : mc.javatest.programmers.mytest
 * fileName       : week3
 * author         : MiracleCat
 * date           : 2023-01-25(025)
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-25(025)        MiracleCat       최초 생성
 */
public class Week3Test7 {

    public static void main(String[] args) {
        Week3Test7 week3Test7 = new Week3Test7();

        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};

        System.out.println(week3Test7.solution(triangle));
    }

    public int solution(int[][] triangle) {
        int answer = 0;

        for (int i = 1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {

                if (j == 0) {
                    triangle[i][j] = triangle[i][j] + triangle[i - 1][j];
                } else if (j == i) {
                    triangle[i][j] = triangle[i][j] + triangle[i - 1][j - 1];
                } else {
                    int left = triangle[i][j] + triangle[i - 1][j - 1];
                    int right = triangle[i][j] + triangle[i - 1][j];
                    triangle[i][j] = Math.max(left, right);
                }

                answer = Math.max(answer, triangle[i][j]);
            }
        }

        return answer;
    }

}
