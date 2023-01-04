/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : AddFractions
 * author         : MiracleCat
 * date           : 2023-01-04
 * description    : 분수의 덧셈
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-04        MiracleCat       최초 생성
 */
public class AddFractions {

    public static void main(String[] args) {
        AddFractions addFractions = new AddFractions();

        int denum1 = 1;
        int num1 = 2;
        int denum2 = 3;
        int num2 = 4;

        System.out.println(Arrays.toString(addFractions.solution(denum1, num1, denum2, num2)));
    }

    /**
     * 0 <denum1, num1, denum2, num2 < 1,000
     */
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];

        int a = num1 * num2;
        int b = denum1 * num2 + denum2 * num1;

        int num = gcd(a, b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(num);
        answer[0] = b / num;
        answer[1] = a / num;

        return answer;
    }

    private int gcd(int a, int b) {

        if(b == 0){
            return a;
        }

        return gcd(b, a % b);
    }

}
