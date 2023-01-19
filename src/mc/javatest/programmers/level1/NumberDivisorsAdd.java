/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : NumberDivisorsAdd
 * author         : MiracleCat
 * date           : 2023-01-18
 * description    : 약수의 개수와 덧셈
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-18        MiracleCat       최초 생성
 */
public class NumberDivisorsAdd {

    public static void main(String[] args) {
        NumberDivisorsAdd numberDivisorsAdd = new NumberDivisorsAdd();

        int left = 1;
        int right = 1;

        System.out.println(numberDivisorsAdd.solution(left, right));
    }

    /**
     * 1 ≤ left ≤ right ≤ 1,000
     */
    public int solution(int left, int right) {
        int answer = 0;

        for(int i = left; i <= right; i++){
            if(calculation(i)) answer += i;
            else answer -= i;

            System.out.println(answer);
        }

        return answer;
    }

    private boolean calculation(int number) {
        int count = number == 1 ? 1 : 2;

        for (int i = 2; i <= number / 2; i++) {
            if(number % i == 0) count++;
        }
        System.out.printf("%s %s %s\n", number, count, count % 2 == 0);
        return count % 2 == 0;
    }

}
