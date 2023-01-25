/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level0;

import java.util.*;

/**
 * packageName    : mc.javatest.programmers.level0
 * fileName       : ModemValue
 * author         : MiracleCat
 * date           : 2023-01-04
 * description    : 최빈값 구하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-04        MiracleCat       최초 생성
 */
public class ModemValue {

    public static void main(String[] args) {
        ModemValue modemValue = new ModemValue();

        int[] array = {1, 2, 3, 3, 3, 4};

        System.out.println(modemValue.solution(array));
    }

    /**
     * 0 < array 의 길이 < 100
     * 0 ≤ array 의 원소 < 1000
     */
    public int solution(int[] array) {
        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : array){
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((k1, k2) -> k2.getValue() - k1.getValue());

        // 배열 길이 1개
        if(list.size() == 1) return list.get(0).getKey();

        // 배열 길이 2개 이상
        if(list.get(0).getValue() > list.get(1).getValue()) answer = list.get(0).getKey();
        // 최빈값 여러개
        else answer = -1;

        return answer;
    }
}
