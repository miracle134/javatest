/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : HailwaterHeatStaticIntegration
 * author         : MiracleCat
 * date           : 2023-01-03
 * description    : 우박수열 정적분
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-03        MiracleCat       최초 생성
 */
public class HailwaterHeatStaticIntegration {

    public static void main(String[] args) {
        HailwaterHeatStaticIntegration hailwaterHeatStaticIntegration = new HailwaterHeatStaticIntegration();

        int k = 5;
        int[][] ranges = {{0, 0}, {0, -1}, {2, -3}, {3, -3}};

        System.out.println(Arrays.toString(hailwaterHeatStaticIntegration.solution(k, ranges)));
    }

    /**
     * 1-1. 입력된 수가 짝수라면 2로 나눕니다.
     * 1-2. 입력된 수가 홀수라면 3을 곱하고 1을 더합니다.
     * 2.결과로 나온 수가 1보다 크다면 1번 작업을 반복합니다.
     * 2 ≤ k ≤ 10,000
     * 1 ≤ ranges 의 길이 ≤ 10,000
     * ranges 의 원소는 [a, b] 형식이며 0 ≤ a < 200, -200 < b ≤ 0 입니다.
     * 주어진 모든 입력에 대해 정적분의 결과는 227 을 넘지 않습니다.
     * 본 문제는 정답에 실수형이 포함되는 문제입니다. 입출력 예의 소수 부분 .0이 코드 실행 버튼 클릭 후 나타나는 결괏값, 기댓값 표시와 다를 수 있습니다.
     */
    public double[] solution(int k, int[][] ranges) {
        double[] answer = new double[ranges.length];

        int[][] hailwater = hailwaterCalcular(k);

        double[] expanse = expanseCalular(hailwater);

        for (int i = 0; i < ranges.length; i++) {
            int left = ranges[i][0];
            int right = (hailwater.length - 1) + ranges[i][1];
            double sum = 0;

            if (left == right) sum = 0;
            else if (left > right) sum = -1;
            else {
                for (int j = left + 1; j <= right; j++) {
                    sum += expanse[j];
                }
            }

            answer[i] = sum;
        }

        return answer;
    }

    // 우박수열 계산
    private int[][] hailwaterCalcular(int k) {
        int value = k;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(value);

        while (value > 1) {
            if (value % 2 != 0) {
                value = value * 3 + 1;
            } else {
                value = value / 2;
            }

            list.add(value);
        }

        int[][] hailwater = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            hailwater[i][0] = i;
            hailwater[i][1] = list.get(i);
        }

        return hailwater;
    }

    // 넓이 계산
    private double[] expanseCalular(int[][] hailwater) {
        double[] expanse = new double[hailwater.length];

        for (int i = 1; i < hailwater.length; i++) {
            expanse[i] = (double) (hailwater[i - 1][1] + hailwater[i][1]) / 2;
        }

        return expanse;
    }

}
