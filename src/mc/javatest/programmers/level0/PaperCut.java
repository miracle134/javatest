/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : PaperCut
 * author         : MiracleCat
 * date           : 2022-12-24(024)
 * description    : 종이 자르기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-24(024)        MiracleCat       최초 생성
 */
public class PaperCut {

    public static void main(String[] args) {
        PaperCut paperCut = new PaperCut();

        int N = 5;
        int M = 2;

        System.out.println(paperCut.solution(M, N));
    }

    /**
     * 0 < M, N < 100
     * 종이를 겹쳐서 자를 수 없습니다.
     *
     * @param M 가로길이
     * @param N 세로길이
     * @return int
     */
    public int solution(int M, int N) {
        int answer = 0;

        answer = M * N - 1;

        return answer;
    }

}
