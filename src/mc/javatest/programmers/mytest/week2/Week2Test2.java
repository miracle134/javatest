/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week2;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.mytest.week2
 * fileName       : Week2Test2
 * author         : MiracleCat
 * date           : 2023-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-18        MiracleCat       최초 생성
 */
public class Week2Test2 {

    public static void main(String[] args) {
        Week2Test2 week2Test2 = new Week2Test2();

        int[] a = {2, 3};
        int[] b = {1, 2, 3};

        System.out.println(week2Test2.solution(a, b));
    }

    public int solution(int[] people, int[] tshirts) {
        int answer = 0;
        int pi = 0;
        int ti = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);

        while (ti < tshirts.length && pi < people.length) {

            if (people[pi] <= tshirts[ti]) {
                answer++;
                pi++;
            }

            ti++;
        }

        return answer;
    }

}
