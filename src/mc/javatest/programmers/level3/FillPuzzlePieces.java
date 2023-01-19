/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level3;

/**
 * packageName    : mc.javatest.programmers.level3
 * fileName       : FillPuzzlePieces
 * author         : MiracleCat
 * date           : 2023-01-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        MiracleCat       최초 생성
 */
public class FillPuzzlePieces {

    public static void main(String[] args) {
        FillPuzzlePieces fillPuzzlePieces = new FillPuzzlePieces();

        int[][] game_board = {{1, 1, 0, 0, 1, 0}, {0, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 0, 1}, {1, 1, 0, 1, 1, 1}, {1, 0, 0, 0, 1, 0}, {0, 1, 1, 1, 0, 0}};
        int[][] table = {{1, 0, 0, 1, 1, 0}, {1, 0, 1, 0, 1, 0}, {0, 1, 1, 0, 1, 1}, {0, 0, 1, 0, 0, 0}, {1, 1, 0, 1, 1, 0}, {0, 1, 0, 0, 0, 0}};

        System.out.println(fillPuzzlePieces.solution(game_board, table));
    }

    public int solution(int[][] game_board, int[][] table) {
        int answer = -1;
        return answer;
    }

}
