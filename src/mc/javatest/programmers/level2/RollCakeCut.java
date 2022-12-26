/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.util.*;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : RollCakeCut
 * author         : MiracleCat
 * date           : 2022-12-23
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-23        MiracleCat       최초 생성
 */
public class RollCakeCut {

    public static void main(String[] args) {
        RollCakeCut rollCakeCut = new RollCakeCut();

        int[] topping = {1, 2, 1, 3, 1, 4, 1, 2};

        System.out.println(rollCakeCut.solution(topping));
    }

    /**
     * 1 ≤ topping 의 길이 ≤ 1,000,000
     * 1 ≤ topping 의 원소 ≤ 10,000
     *
     * @param topping 토핑
     * @return 나누어지는 개수
     */
    public int solution(int[] topping) {
        int answer = 0;

        HashMap<Integer, Integer> chulsuhm = new HashMap<>();
        Queue<Integer> blother = new LinkedList<>();
        HashMap<Integer, Integer> blotherhm = new HashMap<>();

        // 철수 기본 값 추가
        chulsuhm.put(topping[0], chulsuhm.getOrDefault(topping[0],0)+1);

        // 동생 기본 값 추가
        for(int i=1; i < topping.length; i++){
            blother.add(topping[i]);
            blotherhm.put(topping[i], blotherhm.getOrDefault(topping[i],0)+1);
        }

        // 나누 값이 같으면 answer++
        if(chulsuhm.size() == blotherhm.size()) answer++;

        while(!blother.isEmpty() || chulsuhm.size() < blotherhm.size()){
            int tmp = blother.poll();

            // 철수 값 추가
            chulsuhm.put(tmp, chulsuhm.getOrDefault(tmp,0)+1);

            // 동생 값 삭제
            blotherhm.put(tmp, blotherhm.get(tmp)-1);
            if(blotherhm.get(tmp) == 0) blotherhm.remove(tmp);

            if(chulsuhm.size() == blotherhm.size()) answer++;
        }

        return answer;
    }

}
