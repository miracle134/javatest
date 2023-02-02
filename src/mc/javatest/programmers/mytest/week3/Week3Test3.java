/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week3;

import java.util.LinkedList;
import java.util.Queue;

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
public class Week3Test3 {

    public static void main(String[] args) {
        Week3Test3 week3Test3 = new Week3Test3();

        int[][] maps = {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};

        System.out.println(week3Test3.solution(maps));
    }

    public int solution(int[][] maps) {
        int answer = 0;
        boolean[][] check = new boolean[maps.length][maps[0].length];

        Queue<Position> que = new LinkedList<>();

        check[0][0] = true;
        que.add(new Position(0, 0, 1));

        while (!que.isEmpty()) {
            Position p = que.poll();
            int tmpX = p.x;
            int tmpY = p.y;
            int curCnt = p.count;

            // 목적지 도착
            if (tmpY == maps.length - 1 && tmpX == maps[0].length - 1) {
                answer = curCnt;
                break;
            }

            up(que, check, maps, tmpX, tmpY, curCnt + 1);
            down(que, check, maps, tmpX, tmpY, curCnt + 1);
            left(que, check, maps, tmpX, tmpY, curCnt + 1);
            right(que, check, maps, tmpX, tmpY, curCnt + 1);

        }

        // 목적지 도착 실패
        if (!check[maps.length - 1][maps[0].length - 1]) answer = -1;

        return answer;
    }

    private void up(Queue<Position> q, boolean[][] c, int[][] m, int x, int y, int nextCnt) {
        int newY = y - 1;

        if (newY >= 0 && m[newY][x] > 0 && !c[newY][x]) {
            c[newY][x] = true;
            q.add(new Position(x, newY, nextCnt));
        }
    }

    private void down(Queue<Position> q, boolean[][] c, int[][] m, int x, int y, int nextCnt) {
        int newY = y + 1;

        if (newY < m.length && m[newY][x] > 0 && !c[newY][x]) {
            c[newY][x] = true;
            q.add(new Position(x, newY, nextCnt));
        }
    }

    private void left(Queue<Position> q, boolean[][] c, int[][] m, int x, int y, int nextCnt) {
        int newX = x - 1;

        if (newX >= 0 && m[y][newX] > 0 && !c[y][newX]) {
            c[y][newX] = true;
            q.add(new Position(newX, y, nextCnt));
        }
    }

    private void right(Queue<Position> q, boolean[][] c, int[][] m, int x, int y, int nextCnt) {
        int newX = x + 1;

        if (newX < m[0].length && m[y][newX] > 0 && !c[y][newX]) {
            c[y][newX] = true;
            q.add(new Position(newX, y, nextCnt));
        }
    }

    class Position {
        int x;
        int y;
        int count;

        public Position(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }

}
