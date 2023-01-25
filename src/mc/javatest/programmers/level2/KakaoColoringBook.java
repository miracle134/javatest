/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : KakaoColoringBook
 * author         : MiracleCat
 * date           : 2023-01-02
 * description    : 카카오프렌즈 컬러링북
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-02        MiracleCat       최초 생성
 */
public class KakaoColoringBook {

    public static void main(String[] args) {
        KakaoColoringBook kakaoColoringBook = new KakaoColoringBook();

        int m = 6;
        int n = 4;
        int[][] picture = {{1, 1, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 1}};

        System.out.println(Arrays.toString(kakaoColoringBook.solution(m, n, picture)));
    }

    // 방향
    int posit[][] = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    /**
     * 1 <= m, n <= 100
     * picture 의 원소는 0 이상 2^31 - 1 이하의 임의의 값이다.
     * picture 의 원소 중 값이 0인 경우는 색칠하지 않는 영역을 뜻한다.
     */
    public int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        boolean[][] check = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (picture[i][j] == 0) {
                    check[i][j] = true;
                } else if (!check[i][j]) {
                    answer[0]++;
                    int nn = bfs(i, j, check, picture);
                    System.out.println(nn);
                    answer[1] = Math.max(answer[1], nn);
                }
            }
        }


        return answer;
    }

    private int bfs(int ym, int xm, boolean[][] check, int[][] picture) {
        Queue<Position> q = new LinkedList<>();
        int count = 0;
        int curNum = picture[ym][xm];
        q.offer(new Position(xm, ym));
        check[ym][xm] = true;

        while (!q.isEmpty()) {
            Position p = q.poll();
            System.out.printf("%s %s\n", p.y, p.x);
            count++;

            int up = p.y + posit[0][1];
            int down = p.y + posit[1][1];
            int right = p.x + posit[2][0];
            int left = p.x + posit[3][0];

            if (up < picture.length && !check[up][p.x] && picture[up][p.x] == curNum) {
                q.offer(new Position(p.x, up));
                check[up][p.x] = true;
            }
            if (down >= 0 && !check[down][p.x] && picture[down][p.x] == curNum) {
                q.offer(new Position(p.x, down));
                check[down][p.x] = true;
            }
            if (right < picture[0].length && !check[p.y][right] && picture[p.y][right] == curNum) {
                q.offer(new Position(right, p.y));
                check[p.y][right] = true;
            }
            if (left >= 0 && !check[p.y][left] && picture[p.y][left] == curNum) {
                q.offer(new Position(left, p.y));
                check[p.y][left] = true;
            }
        }

        return count;
    }

    class Position {
        int x;
        int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
