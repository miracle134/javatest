/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : ThreeMusketeers
 * author         : MiracleCat
 * date           : 2023-01-10
 * description    : 삼총사
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        MiracleCat       최초 생성
 */
public class ThreeMusketeers {

    public static void main(String[] args) {
        ThreeMusketeers threeMusketeers = new ThreeMusketeers();

        int[] number = {-1, 1, -1, 1};

        System.out.println(threeMusketeers.solution(number));
    }

    /**
     * 3 ≤ number 의 길이 ≤ 13
     * -1,000 ≤ number 의 각 원소 ≤ 1,000
     * 서로 다른 학생의 정수 번호가 같을 수 있습니다.
     */
    public int solution(int[] number) {
        int answer = 0;

        for (int i = 0; i < number.length-2; i++) {
            int mark1 = number[i];

            for (int j = i + 1; j < number.length-1; j++) {
                int mark2 = number[j];

                for (int k = j+1; k < number.length; k++) {
                    int mark3 = number[k];

                    if(mark1 + mark2 + mark3 == 0) answer++;
                }

            }

        }

        return answer;
    }

}
