/**
 * MiracleCat Project
 * Copyright 2016 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.util.*;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : PickTangerine
 * author         : MiracleCat
 * date           : 2022-12-19(019)
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-19(019)        MiracleCat       최초 생성
 */
public class PickTangerine {

    public static void main(String[] args) {
        PickTangerine pickTangerine = new PickTangerine();

        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        System.out.println(pickTangerine.solution(k, tangerine));
    }

    /**
     * 1 ≤ k ≤ tangerine의 길이 ≤ 100,000
     * 1 ≤ tangerine의 원소 ≤ 10,000,000
     *
     * @param k
     * @param tangerine
     * @return
     */
    public int solution(int k, int[] tangerine) {
        int answer = 0;

        HashMap<Integer, Integer> hm = new HashMap<>();

        // 크기별 귤 개수
        for (int i : tangerine){
            hm.put(i, hm.getOrDefault(i, 0)+1);
        }

        // 리스트 전환하면서 큰 개수순으로 정렬
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());
        list.sort((v1, v2)-> Integer.compare(v2.getValue(), v1.getValue()));

        // 상자에 담기
        for(Map.Entry<Integer, Integer> e : list){
            answer++;
            k -= e.getValue();

            if(k <= 0) break;
        }

        return answer;
    }

}
