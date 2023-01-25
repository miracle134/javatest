package mc.javatest.programmers.mytest.week1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NumberGame {

    public static void main(String[] args) throws Exception {
        NumberGame numberGame = new NumberGame();

        int[] A = {5, 1, 3, 7};
        int[] B = {2, 2, 6, 8};

        System.out.println("리턴 값 : " + numberGame.solution(A, B));

    }

    public int solution(int[] A, int[] B) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        Queue<Integer> qB = new LinkedList<>();

        for (int i : B) {
            qB.add(i);
        }

        for (int i : A) {
            if (qB.isEmpty()) break;

            while (!qB.isEmpty()) {
                int tmp = qB.poll();

                if (i < tmp) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }
}
