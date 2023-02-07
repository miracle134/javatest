/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.mytest.week3;

import java.util.HashMap;
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
public class Week3Test2 {

    public static void main(String[] args) {
        Week3Test2 week3Test2 = new Week3Test2();

        int[] bell = {1, 2, 1, 1, 1, 2, 2, 1};

        System.out.println(week3Test2.solution(bell));
    }

    public int solution(int[] bell) {

        for (int i = 0; i < bell.length; i++)
            if(bell[i] == 2) bell[i] = -1;

        HashMap<Integer, Integer> hm = new HashMap<>();

        int total = bell[0];
        int answer = 0;

        hm.put(0, -1);
        hm.put(total, 0);

        for (int i = 1; i < bell.length; i++) {
            total += bell[i];

            if(!hm.containsKey(total)){

                hm.put(total, i);

            }else{

                answer = Math.max(answer, i - hm.get(total));

            }

        }

        return answer;
    }

}
