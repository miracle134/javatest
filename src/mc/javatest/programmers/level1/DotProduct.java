/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : DotProduct
 * author         : MiracleCat
 * date           : 2023-01-18
 * description    : 내적
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-18        MiracleCat       최초 생성
 */
public class DotProduct {

    public static void main(String[] args) {
        DotProduct dotProduct = new DotProduct();

        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};

        System.out.println(dotProduct.solution(a, b));
    }

    /**
     * a, b의 길이는 1 이상 1,000 이하입니다.
     * a, b의 모든 수는 -1,000 이상 1,000 이하입니다.
     */
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }

}
