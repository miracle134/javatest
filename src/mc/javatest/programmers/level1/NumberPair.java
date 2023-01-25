/**
 * MiracleCat Project
 * Copyright 2018 https://github.com/miracle134
 */
package mc.javatest.programmers.level1;

import java.util.HashMap;

/**
 * packageName    : mc.javatest.programmers.level1
 * fileName       : NumberPair
 * author         : MiracleCat
 * date           : 2023-01-10
 * description    : 숫자 짝꿍
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-01-10        MiracleCat       최초 생성
 */
public class NumberPair {

    public static void main(String[] args) {
        NumberPair numberPair = new NumberPair();

        String X = "100";
        String Y = "203045";

        System.out.println(numberPair.solution(X, Y));
    }

    /**
     * 3 ≤ X, Y의 길이(자릿수) ≤ 3,000,000입니다.
     * X, Y는 0으로 시작하지 않습니다.
     * X, Y의 짝꿍은 상당히 큰 정수일 수 있으므로, 문자열로 반환합니다.
     */
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Long> hmX = new HashMap<>();
        HashMap<Integer, Long> hmY = new HashMap<>();
        HashMap<Integer, Long> hmResult = new HashMap<>();

        for (String s : X.split("")) {
            int tmp = Integer.parseInt(s);
            hmX.put(tmp, hmX.getOrDefault(tmp, 0L) + 1);
        }

        for (String s : Y.split("")) {
            int tmp = Integer.parseInt(s);
            hmY.put(tmp, hmY.getOrDefault(tmp, 0L) + 1);
        }

        for (Integer i : hmX.keySet()) {
            Long tmpX = hmX.get(i);
            Long tmpY = hmY.getOrDefault(i, 0L);

            if (Math.min(tmpX, tmpY) > 0) {
                hmResult.put(i, Math.min(tmpX, tmpY));
            }
        }

        // 짝 지을 수 없을때
        if (hmResult.isEmpty()) return "-1";

        // 0일때
        if (hmResult.size() == 1 && hmResult.get(0) != null) return "0";

        for (int i = 9; i >= 0; i--) {
            if (hmResult.get(i) != null) {
                for (int j = 0; j < hmResult.get(i); j++) {
                    sb.append(i);
                }
            }
        }

        return sb.toString();
    }

}
