/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level2;

import java.util.Arrays;

/**
 * packageName    : mc.javatest.programmers.level2
 * fileName       : MagicElevator
 * author         : MiracleCat
 * date           : 2022-12-31(031)
 * description    : 마법의 엘리베이터
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-12-31(031)        MiracleCat       최초 생성
 */
public class MagicElevator {

    public static void main(String[] args) {
        MagicElevator magicElevator = new MagicElevator();

        int storey = 16;

        System.out.println(magicElevator.solution(storey));
    }

    /**
     * 1 ≤ storey ≤ 100,000,000
     */
    public int solution(int storey) {
        int answer = 0;
        String[] storeyArr = String.valueOf(storey).split("");
        int[] storeyIntArr = Arrays.stream(storeyArr).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < storeyIntArr.length; i++) {
            int tmp = storeyIntArr[storeyIntArr.length - (1 + i)];

            // 5 미만 이면 - 이상이면 +
            if (tmp < 5
                    || tmp < 6 && i + 1 == storeyIntArr.length) {
                answer += tmp;
            } else if(tmp == 5) {
                answer += (10 - tmp);
                if(storeyIntArr[storeyIntArr.length - (2 + i)] >= 5){
                    storeyIntArr[storeyIntArr.length - (2 + i)] = storeyIntArr[storeyIntArr.length - (2 + i)] + 1;
                }
            }else{
                // 자릿수 올라갈때 +1
                if (i + 1 < storeyIntArr.length) {
                    answer += (10 - tmp);
                    storeyIntArr[storeyIntArr.length - (2 + i)] = storeyIntArr[storeyIntArr.length - (2 + i)] + 1;
                } else {
                    answer += (10 - tmp);
                    answer++;
                }
            }

        }

        return answer;
    }

}
